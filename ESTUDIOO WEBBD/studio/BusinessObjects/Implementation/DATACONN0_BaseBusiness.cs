/*************************************************************
** Class generated by CodeTrigger, Version 4.3.0.6
** CodeTrigger is an Exotechnic Corporation (UK) Ltd Product 
** This class was generated on 08/06/2014 17:05:12
**************************************************************/

using System;
using System.Data;
using System.Data.SqlTypes;
using System.Data.SqlClient;
using System.Configuration;
using System.Collections.Generic;
using studio.DataObjects;

namespace studio.BusinessObjects
{
	public partial class DATACONN0_BaseBusiness 
	{
		protected DATACONN0_TxConnectionProvider _txConnectionProvider;
		protected List<DATACONN0_BaseBusiness> _listBusObjects = new List<DATACONN0_BaseBusiness>();
		int _nestLevel;

		public DATACONN0_BaseBusiness()
		{
			Init();
		}

		protected virtual void Init()
		{
			_nestLevel = 0;
			_txConnectionProvider = null;
		}

		protected virtual void RegisterDataObject(DATACONN0_BaseData dataObject)
		{
				if(_txConnectionProvider == null)
					_txConnectionProvider = new DATACONN0_TxConnectionProvider();
		
				if(dataObject != null)
					dataObject.ConnectionProvider = _txConnectionProvider;
		}

		protected virtual void RegisterBusinessObject(DATACONN0_BaseBusiness busObject)
		{
				if(_txConnectionProvider == null)
					_txConnectionProvider = new DATACONN0_TxConnectionProvider();
				busObject.ConnectionProvider = _txConnectionProvider;

				if(!_listBusObjects.Contains(busObject))
					_listBusObjects.Add(busObject);

		}

		public virtual void BeginTransaction(string trans)
		{
			if(_nestLevel == 0)
			{
				if(_txConnectionProvider == null)
					_txConnectionProvider = new DATACONN0_TxConnectionProvider();
				
				_txConnectionProvider.OpenConnection();
				_txConnectionProvider.BeginTransaction(trans);

				if(_listBusObjects != null)
					foreach (DATACONN0_BaseBusiness busObj in _listBusObjects)
						busObj.MarkSubTransaction();
			}
			_nestLevel++;
		}

		public virtual void MarkSubTransaction()
		{
			_nestLevel++;
		}

		public virtual void RollbackTransaction(string trans)
		{
			if(_nestLevel > 0)
				_nestLevel--;
			
			if(_nestLevel == 0)
			{
				_txConnectionProvider.RollbackTransaction(trans);
				_txConnectionProvider.CloseConnection(false);
				_txConnectionProvider = null;
			}
		}

		public virtual void CommitTransaction()
		{
			if(_nestLevel > 0)
				_nestLevel--;
			
			if(_nestLevel == 0)
			{
				_txConnectionProvider.CommitTransaction();
				_txConnectionProvider.CloseConnection(false);
				_txConnectionProvider = null;
			}
		}

		public DATACONN0_TxConnectionProvider ConnectionProvider
		{
			get
			{
				return _txConnectionProvider;
			}
			set
			{
				if(value == null)
					throw new Exception("Connection provider cannot be null");
				
				_txConnectionProvider = value;
			}
		}

	}
}