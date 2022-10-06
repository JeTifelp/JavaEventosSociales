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
	///This is the definition of the class BOCobros.
	///</Summary>
	public partial class BOCobros : DATACONN0_BaseBusiness
	{
		#region member variables
		protected Int32? _nro;
		protected Int32? _idCont;
		protected string _nombreApellido;
		protected decimal? _monto;
		protected DateTime? _fecha;
		protected TimeSpan? _hora;
		protected string _cie;
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
		public BOCobros()
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
		///Int32 nro
		///</parameters>
		public BOCobros(Int32 nro)
		{
			try
			{
				DAOCobros daoCobros = DAOCobros.SelectOne(nro);
				_nro = daoCobros.Nro;
				_idCont = daoCobros.IdCont;
				_nombreApellido = daoCobros.NombreApellido;
				_monto = daoCobros.Monto;
				_fecha = daoCobros.Fecha;
				_hora = daoCobros.Hora;
				_cie = daoCobros.Cie;
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
		///DAOCobros
		///</parameters>
		protected internal BOCobros(DAOCobros daoCobros)
		{
			try
			{
				_nro = daoCobros.Nro;
				_idCont = daoCobros.IdCont;
				_nombreApellido = daoCobros.NombreApellido;
				_monto = daoCobros.Monto;
				_fecha = daoCobros.Fecha;
				_hora = daoCobros.Hora;
				_cie = daoCobros.Cie;
			}
			catch
			{
				throw;
			}
		}

		///<Summary>
		///SaveNew
		///This method persists a new Cobros record to the store
		///</Summary>
		///<returns>
		///void
		///</returns>
		///<parameters>
		///
		///</parameters>
		public virtual void SaveNew()
		{
			DAOCobros daoCobros = new DAOCobros();
			RegisterDataObject(daoCobros);
			BeginTransaction("savenewBOCobros");
			try
			{
				daoCobros.Nro = _nro;
				daoCobros.IdCont = _idCont;
				daoCobros.NombreApellido = _nombreApellido;
				daoCobros.Monto = _monto;
				daoCobros.Fecha = _fecha;
				daoCobros.Hora = _hora;
				daoCobros.Cie = _cie;
				daoCobros.Insert();
				CommitTransaction();
				
				_nro = daoCobros.Nro;
				_idCont = daoCobros.IdCont;
				_nombreApellido = daoCobros.NombreApellido;
				_monto = daoCobros.Monto;
				_fecha = daoCobros.Fecha;
				_hora = daoCobros.Hora;
				_cie = daoCobros.Cie;
				_isDirty = false;
			}
			catch
			{
				RollbackTransaction("savenewBOCobros");
				throw;
			}
		}
		
		///<Summary>
		///Update
		///This method updates one Cobros record in the store
		///</Summary>
		///<returns>
		///void
		///</returns>
		///<parameters>
		///BOCobros
		///</parameters>
		public virtual void Update()
		{
			DAOCobros daoCobros = new DAOCobros();
			RegisterDataObject(daoCobros);
			BeginTransaction("updateBOCobros");
			try
			{
				daoCobros.Nro = _nro;
				daoCobros.IdCont = _idCont;
				daoCobros.NombreApellido = _nombreApellido;
				daoCobros.Monto = _monto;
				daoCobros.Fecha = _fecha;
				daoCobros.Hora = _hora;
				daoCobros.Cie = _cie;
				daoCobros.Update();
				CommitTransaction();
				
				_nro = daoCobros.Nro;
				_idCont = daoCobros.IdCont;
				_nombreApellido = daoCobros.NombreApellido;
				_monto = daoCobros.Monto;
				_fecha = daoCobros.Fecha;
				_hora = daoCobros.Hora;
				_cie = daoCobros.Cie;
				_isDirty = false;
			}
			catch
			{
				RollbackTransaction("updateBOCobros");
				throw;
			}
		}
		///<Summary>
		///Delete
		///This method deletes one Cobros record from the store
		///</Summary>
		///<returns>
		///void
		///</returns>
		///<parameters>
		///
		///</parameters>
		public virtual void Delete()
		{
			DAOCobros daoCobros = new DAOCobros();
			RegisterDataObject(daoCobros);
			BeginTransaction("deleteBOCobros");
			try
			{
				daoCobros.Nro = _nro;
				daoCobros.Delete();
				CommitTransaction();
			}
			catch
			{
				RollbackTransaction("deleteBOCobros");
				throw;
			}
		}
		
		///<Summary>
		///CobrosCollection
		///This method returns the collection of BOCobros objects
		///</Summary>
		///<returns>
		///List[BOCobros]
		///</returns>
		///<parameters>
		///
		///</parameters>
		public static List<BOCobros> CobrosCollection()
		{
			List<BOCobros> boCobrosCollection = new List<BOCobros>();
			List<DAOCobros> daoCobrosCollection = DAOCobros.SelectAll();
			
			foreach(DAOCobros daoCobros in daoCobrosCollection)
				boCobrosCollection.Add(new BOCobros(daoCobros));
			
			 return boCobrosCollection;
			
		}
		
		
		///<Summary>
		///CobrosCollectionCount
		///This method returns the collection count of BOCobros objects
		///</Summary>
		///<returns>
		///Int32
		///</returns>
		///<parameters>
		///
		///</parameters>
		public static Int32 CobrosCollectionCount()
		{
			Int32 objCount = DAOCobros.SelectAllCount();
			return objCount;
			
		}
		
		
		public static List<BOCobros> CobrosCollectionFromSearchFields(BOCobros boCobros)
		{
			List<BOCobros> boCobrosCollection = new List<BOCobros>();
			DAOCobros daoCobros = new DAOCobros();
			daoCobros.Nro = boCobros.Nro;
			daoCobros.IdCont = boCobros.IdCont;
			daoCobros.NombreApellido = boCobros.NombreApellido;
			daoCobros.Monto = boCobros.Monto;
			daoCobros.Fecha = boCobros.Fecha;
			daoCobros.Hora = boCobros.Hora;
			daoCobros.Cie = boCobros.Cie;
			List<DAOCobros> daoCobrosCollection = DAOCobros.SelectAllBySearchFields(daoCobros);
			
			foreach(DAOCobros resdaoCobros in daoCobrosCollection)
				boCobrosCollection.Add(new BOCobros(resdaoCobros));
			
			return boCobrosCollection;
			
		}
		
		
		public static Int32 CobrosCollectionFromSearchFieldsCount(BOCobros boCobros)
		{
			DAOCobros daoCobros = new DAOCobros();
			daoCobros.Nro = boCobros.Nro;
			daoCobros.IdCont = boCobros.IdCont;
			daoCobros.NombreApellido = boCobros.NombreApellido;
			daoCobros.Monto = boCobros.Monto;
			daoCobros.Fecha = boCobros.Fecha;
			daoCobros.Hora = boCobros.Hora;
			daoCobros.Cie = boCobros.Cie;
			Int32 objCount = DAOCobros.SelectAllBySearchFieldsCount(daoCobros);
			
			return objCount;
			
		}
		
		#endregion

		#region member properties
		
		public virtual Int32? Nro
		{
			get
			{
				 return _nro;
			}
			set
			{
				_nro = value;
				_isDirty = true;
			}
		}
		
		public virtual Int32? IdCont
		{
			get
			{
				 return _idCont;
			}
			set
			{
				_idCont = value;
				_isDirty = true;
			}
		}
		
		public virtual string NombreApellido
		{
			get
			{
				 return _nombreApellido;
			}
			set
			{
				_nombreApellido = value;
				_isDirty = true;
			}
		}
		
		public virtual decimal? Monto
		{
			get
			{
				 return _monto;
			}
			set
			{
				_monto = value;
				_isDirty = true;
			}
		}
		
		public virtual DateTime? Fecha
		{
			get
			{
				 return _fecha;
			}
			set
			{
				_fecha = value;
				_isDirty = true;
			}
		}
		
		public virtual TimeSpan? Hora
		{
			get
			{
				 return _hora;
			}
			set
			{
				_hora = value;
				_isDirty = true;
			}
		}
		
		public virtual string Cie
		{
			get
			{
				 return _cie;
			}
			set
			{
				_cie = value;
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