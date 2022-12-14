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
	///This is the definition of the class BOComponentePaquete.
	///</Summary>
	public partial class BOComponentePaquete : DATACONN0_BaseBusiness
	{
		#region member variables
		protected Int16? _id;
		protected string _nombre;
		protected decimal? _precio;
		protected bool? _icono;
		protected Int16? _idCC;
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
		public BOComponentePaquete()
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
		///Int16 id
		///</parameters>
		public BOComponentePaquete(Int16 id)
		{
			try
			{
				DAOComponentePaquete daoComponentePaquete = DAOComponentePaquete.SelectOne(id);
				_id = daoComponentePaquete.Id;
				_nombre = daoComponentePaquete.Nombre;
				_precio = daoComponentePaquete.Precio;
				_icono = daoComponentePaquete.Icono;
				_idCC = daoComponentePaquete.IdCC;
			}
			catch
			{
				throw;
			}
		}

		///<Summary>
		///Constructor
		///Constructor using unique field(s)
		///</Summary>
		///<returns>
		///void
		///</returns>
		///<parameters>
		///Nombre
		///</parameters>
		public BOComponentePaquete(string nombre)
		{
			try
			{
				DAOComponentePaquete daoComponentePaquete = DAOComponentePaquete.SelectOneByNombre(nombre);
				_id = daoComponentePaquete.Id;
				_nombre = daoComponentePaquete.Nombre;
				_precio = daoComponentePaquete.Precio;
				_icono = daoComponentePaquete.Icono;
				_idCC = daoComponentePaquete.IdCC;
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
		///DAOComponentePaquete
		///</parameters>
		protected internal BOComponentePaquete(DAOComponentePaquete daoComponentePaquete)
		{
			try
			{
				_id = daoComponentePaquete.Id;
				_nombre = daoComponentePaquete.Nombre;
				_precio = daoComponentePaquete.Precio;
				_icono = daoComponentePaquete.Icono;
				_idCC = daoComponentePaquete.IdCC;
			}
			catch
			{
				throw;
			}
		}

		///<Summary>
		///SaveNew
		///This method persists a new ComponentePaquete record to the store
		///</Summary>
		///<returns>
		///void
		///</returns>
		///<parameters>
		///
		///</parameters>
		public virtual void SaveNew()
		{
			DAOComponentePaquete daoComponentePaquete = new DAOComponentePaquete();
			RegisterDataObject(daoComponentePaquete);
			BeginTransaction("savenewBOComponentePaquete");
			try
			{
				daoComponentePaquete.Nombre = _nombre;
				daoComponentePaquete.Precio = _precio;
				daoComponentePaquete.Icono = _icono;
				daoComponentePaquete.IdCC = _idCC;
				daoComponentePaquete.Insert();
				CommitTransaction();
				
				_id = daoComponentePaquete.Id;
				_nombre = daoComponentePaquete.Nombre;
				_precio = daoComponentePaquete.Precio;
				_icono = daoComponentePaquete.Icono;
				_idCC = daoComponentePaquete.IdCC;
				_isDirty = false;
			}
			catch
			{
				RollbackTransaction("savenewBOComponentePaquete");
				throw;
			}
		}
		
		///<Summary>
		///Update
		///This method updates one ComponentePaquete record in the store
		///</Summary>
		///<returns>
		///void
		///</returns>
		///<parameters>
		///BOComponentePaquete
		///</parameters>
		public virtual void Update()
		{
			DAOComponentePaquete daoComponentePaquete = new DAOComponentePaquete();
			RegisterDataObject(daoComponentePaquete);
			BeginTransaction("updateBOComponentePaquete");
			try
			{
				daoComponentePaquete.Id = _id;
				daoComponentePaquete.Nombre = _nombre;
				daoComponentePaquete.Precio = _precio;
				daoComponentePaquete.Icono = _icono;
				daoComponentePaquete.IdCC = _idCC;
				daoComponentePaquete.Update();
				CommitTransaction();
				
				_id = daoComponentePaquete.Id;
				_nombre = daoComponentePaquete.Nombre;
				_precio = daoComponentePaquete.Precio;
				_icono = daoComponentePaquete.Icono;
				_idCC = daoComponentePaquete.IdCC;
				_isDirty = false;
			}
			catch
			{
				RollbackTransaction("updateBOComponentePaquete");
				throw;
			}
		}
		///<Summary>
		///Delete
		///This method deletes one ComponentePaquete record from the store
		///</Summary>
		///<returns>
		///void
		///</returns>
		///<parameters>
		///
		///</parameters>
		public virtual void Delete()
		{
			DAOComponentePaquete daoComponentePaquete = new DAOComponentePaquete();
			RegisterDataObject(daoComponentePaquete);
			BeginTransaction("deleteBOComponentePaquete");
			try
			{
				daoComponentePaquete.Id = _id;
				daoComponentePaquete.Delete();
				CommitTransaction();
			}
			catch
			{
				RollbackTransaction("deleteBOComponentePaquete");
				throw;
			}
		}
		
		///<Summary>
		///ComponentePaqueteCollection
		///This method returns the collection of BOComponentePaquete objects
		///</Summary>
		///<returns>
		///List[BOComponentePaquete]
		///</returns>
		///<parameters>
		///
		///</parameters>
		public static List<BOComponentePaquete> ComponentePaqueteCollection()
		{
			List<BOComponentePaquete> boComponentePaqueteCollection = new List<BOComponentePaquete>();
			List<DAOComponentePaquete> daoComponentePaqueteCollection = DAOComponentePaquete.SelectAll();
			
			foreach(DAOComponentePaquete daoComponentePaquete in daoComponentePaqueteCollection)
				boComponentePaqueteCollection.Add(new BOComponentePaquete(daoComponentePaquete));
			
			 return boComponentePaqueteCollection;
			
		}
		
		
		///<Summary>
		///ComponentePaqueteCollectionCount
		///This method returns the collection count of BOComponentePaquete objects
		///</Summary>
		///<returns>
		///Int32
		///</returns>
		///<parameters>
		///
		///</parameters>
		public static Int32 ComponentePaqueteCollectionCount()
		{
			Int32 objCount = DAOComponentePaquete.SelectAllCount();
			return objCount;
			
		}
		
		
		public static List<BOComponentePaquete> ComponentePaqueteCollectionFromSearchFields(BOComponentePaquete boComponentePaquete)
		{
			List<BOComponentePaquete> boComponentePaqueteCollection = new List<BOComponentePaquete>();
			DAOComponentePaquete daoComponentePaquete = new DAOComponentePaquete();
			daoComponentePaquete.Id = boComponentePaquete.Id;
			daoComponentePaquete.Nombre = boComponentePaquete.Nombre;
			daoComponentePaquete.Precio = boComponentePaquete.Precio;
			daoComponentePaquete.Icono = boComponentePaquete.Icono;
			daoComponentePaquete.IdCC = boComponentePaquete.IdCC;
			List<DAOComponentePaquete> daoComponentePaqueteCollection = DAOComponentePaquete.SelectAllBySearchFields(daoComponentePaquete);
			
			foreach(DAOComponentePaquete resdaoComponentePaquete in daoComponentePaqueteCollection)
				boComponentePaqueteCollection.Add(new BOComponentePaquete(resdaoComponentePaquete));
			
			return boComponentePaqueteCollection;
			
		}
		
		
		public static Int32 ComponentePaqueteCollectionFromSearchFieldsCount(BOComponentePaquete boComponentePaquete)
		{
			DAOComponentePaquete daoComponentePaquete = new DAOComponentePaquete();
			daoComponentePaquete.Id = boComponentePaquete.Id;
			daoComponentePaquete.Nombre = boComponentePaquete.Nombre;
			daoComponentePaquete.Precio = boComponentePaquete.Precio;
			daoComponentePaquete.Icono = boComponentePaquete.Icono;
			daoComponentePaquete.IdCC = boComponentePaquete.IdCC;
			Int32 objCount = DAOComponentePaquete.SelectAllBySearchFieldsCount(daoComponentePaquete);
			
			return objCount;
			
		}
		
		#endregion

		#region member properties
		
		public virtual Int16? Id
		{
			get
			{
				 return _id;
			}
			set
			{
				_id = value;
				_isDirty = true;
			}
		}
		
		public virtual string Nombre
		{
			get
			{
				 return _nombre;
			}
			set
			{
				_nombre = value;
				_isDirty = true;
			}
		}
		
		public virtual decimal? Precio
		{
			get
			{
				 return _precio;
			}
			set
			{
				_precio = value;
				_isDirty = true;
			}
		}
		
		public virtual bool? Icono
		{
			get
			{
				 return _icono;
			}
			set
			{
				_icono = value;
				_isDirty = true;
			}
		}
		
		public virtual Int16? IdCC
		{
			get
			{
				 return _idCC;
			}
			set
			{
				_idCC = value;
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
