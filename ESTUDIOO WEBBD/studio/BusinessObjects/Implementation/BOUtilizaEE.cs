/*************************************************************
** Class generated by CodeTrigger, Version 4.3.0.6
** CodeTrigger is an Exotechnic Corporation (UK) Ltd Product 
** This class was generated on 08/06/2014 17:05:12
** Changes to this file may cause incorrect behaviour and will be lost if the code is regenerated
**************************************************************/
using System;
using System.Collections.Generic;
using studio.DataObjects;

namespace studio.BusinessObjects
{
	///<Summary>
	///Class definition
	///This is the definition of the class BOUtilizaEE.
	///</Summary>
	public partial class BOUtilizaEE : DATACONN0_BaseBusiness
	{
		#region member variables
		protected Int32? _idEven;
		protected Int16? _idEq;
		protected bool _isDirty = false;
		/*collection member objects*******************/
		/*********************************************/
		#endregion

		#region class methods
		///<Summary>
		///Constructor
		///This is the default constructor
		///</Summary>
		///<returns>
		///void
		///</returns>
		///<parameters>
		///
		///</parameters>
		public BOUtilizaEE()
		{
		}

		///<Summary>
		///Constructor
		///Constructor using primary key(s)
		///</Summary>
		///<returns>
		///void
		///</returns>
		///<parameters>
		///Int32 idEven, Int16 idEq
		///</parameters>
		public BOUtilizaEE(Int32 idEven, Int16 idEq)
		{
			try
			{
				DAOUtilizaEE daoUtilizaEE = DAOUtilizaEE.SelectOne(idEven, idEq);
				_idEven = daoUtilizaEE.IdEven;
				_idEq = daoUtilizaEE.IdEq;
			}
			catch
			{
				throw;
			}
		}

		///<Summary>
		///Constructor
		///This constructor initializes the business object from its respective data object
		///</Summary>
		///<returns>
		///void
		///</returns>
		///<parameters>
		///DAOUtilizaEE
		///</parameters>
		protected internal BOUtilizaEE(DAOUtilizaEE daoUtilizaEE)
		{
			try
			{
				_idEven = daoUtilizaEE.IdEven;
				_idEq = daoUtilizaEE.IdEq;
			}
			catch
			{
				throw;
			}
		}

		///<Summary>
		///SaveNew
		///This method persists a new UtilizaEE record to the store
		///</Summary>
		///<returns>
		///void
		///</returns>
		///<parameters>
		///
		///</parameters>
		public virtual void SaveNew()
		{
			DAOUtilizaEE daoUtilizaEE = new DAOUtilizaEE();
			RegisterDataObject(daoUtilizaEE);
			BeginTransaction("savenewBOUtilizaEE");
			try
			{
				daoUtilizaEE.IdEven = _idEven;
				daoUtilizaEE.IdEq = _idEq;
				daoUtilizaEE.Insert();
				CommitTransaction();
				
				_idEven = daoUtilizaEE.IdEven;
				_idEq = daoUtilizaEE.IdEq;
				_isDirty = false;
			}
			catch
			{
				RollbackTransaction("savenewBOUtilizaEE");
				throw;
			}
		}
		
		///<Summary>
		///Delete
		///This method deletes one UtilizaEE record from the store
		///</Summary>
		///<returns>
		///void
		///</returns>
		///<parameters>
		///
		///</parameters>
		public virtual void Delete()
		{
			DAOUtilizaEE daoUtilizaEE = new DAOUtilizaEE();
			RegisterDataObject(daoUtilizaEE);
			BeginTransaction("deleteBOUtilizaEE");
			try
			{
				daoUtilizaEE.IdEven = _idEven;
				daoUtilizaEE.IdEq = _idEq;
				daoUtilizaEE.Delete();
				CommitTransaction();
			}
			catch
			{
				RollbackTransaction("deleteBOUtilizaEE");
				throw;
			}
		}
		
		///<Summary>
		///UtilizaEECollection
		///This method returns the collection of BOUtilizaEE objects
		///</Summary>
		///<returns>
		///List[BOUtilizaEE]
		///</returns>
		///<parameters>
		///
		///</parameters>
		public static List<BOUtilizaEE> UtilizaEECollection()
		{
			List<BOUtilizaEE> boUtilizaEECollection = new List<BOUtilizaEE>();
			List<DAOUtilizaEE> daoUtilizaEECollection = DAOUtilizaEE.SelectAll();
			
			foreach(DAOUtilizaEE daoUtilizaEE in daoUtilizaEECollection)
				boUtilizaEECollection.Add(new BOUtilizaEE(daoUtilizaEE));
			
			 return boUtilizaEECollection;
			
		}
		
		
		///<Summary>
		///UtilizaEECollectionCount
		///This method returns the collection count of BOUtilizaEE objects
		///</Summary>
		///<returns>
		///Int32
		///</returns>
		///<parameters>
		///
		///</parameters>
		public static Int32 UtilizaEECollectionCount()
		{
			Int32 objCount = DAOUtilizaEE.SelectAllCount();
			return objCount;
			
		}
		
		
		public static List<BOUtilizaEE> UtilizaEECollectionFromSearchFields(BOUtilizaEE boUtilizaEE)
		{
			List<BOUtilizaEE> boUtilizaEECollection = new List<BOUtilizaEE>();
			DAOUtilizaEE daoUtilizaEE = new DAOUtilizaEE();
			daoUtilizaEE.IdEven = boUtilizaEE.IdEven;
			daoUtilizaEE.IdEq = boUtilizaEE.IdEq;
			List<DAOUtilizaEE> daoUtilizaEECollection = DAOUtilizaEE.SelectAllBySearchFields(daoUtilizaEE);
			
			foreach(DAOUtilizaEE resdaoUtilizaEE in daoUtilizaEECollection)
				boUtilizaEECollection.Add(new BOUtilizaEE(resdaoUtilizaEE));
			
			return boUtilizaEECollection;
			
		}
		
		
		public static Int32 UtilizaEECollectionFromSearchFieldsCount(BOUtilizaEE boUtilizaEE)
		{
			DAOUtilizaEE daoUtilizaEE = new DAOUtilizaEE();
			daoUtilizaEE.IdEven = boUtilizaEE.IdEven;
			daoUtilizaEE.IdEq = boUtilizaEE.IdEq;
			Int32 objCount = DAOUtilizaEE.SelectAllBySearchFieldsCount(daoUtilizaEE);
			
			return objCount;
			
		}
		
		#endregion

		#region member properties
		
		public virtual Int32? IdEven
		{
			get
			{
				 return _idEven;
			}
			set
			{
				_idEven = value;
				_isDirty = true;
			}
		}
		
		public virtual Int16? IdEq
		{
			get
			{
				 return _idEq;
			}
			set
			{
				_idEq = value;
				_isDirty = true;
			}
		}
		
		public virtual bool IsDirty
		{
			get
			{
				 return _isDirty;
			}
			set
			{
				_isDirty = value;
			}
		}
		#endregion
	}
}
