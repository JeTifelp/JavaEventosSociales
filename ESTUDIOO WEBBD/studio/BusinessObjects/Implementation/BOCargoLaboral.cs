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
	///This is the definition of the class BOCargoLaboral.
	///</Summary>
	public partial class BOCargoLaboral : DATACONN0_BaseBusiness
	{
		#region member variables
		protected Int16? _id;
		protected string _nombre;
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
		public BOCargoLaboral()
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
		public BOCargoLaboral(Int16 id)
		{
			try
			{
				DAOCargoLaboral daoCargoLaboral = DAOCargoLaboral.SelectOne(id);
				_id = daoCargoLaboral.Id;
				_nombre = daoCargoLaboral.Nombre;
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
		public BOCargoLaboral(string nombre)
		{
			try
			{
				DAOCargoLaboral daoCargoLaboral = DAOCargoLaboral.SelectOneByNombre(nombre);
				_id = daoCargoLaboral.Id;
				_nombre = daoCargoLaboral.Nombre;
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
		///DAOCargoLaboral
		///</parameters>
		protected internal BOCargoLaboral(DAOCargoLaboral daoCargoLaboral)
		{
			try
			{
				_id = daoCargoLaboral.Id;
				_nombre = daoCargoLaboral.Nombre;
			}
			catch
			{
				throw;
			}
		}

		///<Summary>
		///SaveNew
		///This method persists a new CargoLaboral record to the store
		///</Summary>
		///<returns>
		///void
		///</returns>
		///<parameters>
		///
		///</parameters>
		public virtual void SaveNew()
		{
			DAOCargoLaboral daoCargoLaboral = new DAOCargoLaboral();
			RegisterDataObject(daoCargoLaboral);
			BeginTransaction("savenewBOCargoLaboral");
			try
			{
				daoCargoLaboral.Nombre = _nombre;
				daoCargoLaboral.Insert();
				CommitTransaction();
				
				_id = daoCargoLaboral.Id;
				_nombre = daoCargoLaboral.Nombre;
				_isDirty = false;
			}
			catch
			{
				RollbackTransaction("savenewBOCargoLaboral");
				throw;
			}
		}
		
		///<Summary>
		///Update
		///This method updates one CargoLaboral record in the store
		///</Summary>
		///<returns>
		///void
		///</returns>
		///<parameters>
		///BOCargoLaboral
		///</parameters>
		public virtual void Update()
		{
			DAOCargoLaboral daoCargoLaboral = new DAOCargoLaboral();
			RegisterDataObject(daoCargoLaboral);
			BeginTransaction("updateBOCargoLaboral");
			try
			{
				daoCargoLaboral.Id = _id;
				daoCargoLaboral.Nombre = _nombre;
				daoCargoLaboral.Update();
				CommitTransaction();
				
				_id = daoCargoLaboral.Id;
				_nombre = daoCargoLaboral.Nombre;
				_isDirty = false;
			}
			catch
			{
				RollbackTransaction("updateBOCargoLaboral");
				throw;
			}
		}
		///<Summary>
		///Delete
		///This method deletes one CargoLaboral record from the store
		///</Summary>
		///<returns>
		///void
		///</returns>
		///<parameters>
		///
		///</parameters>
		public virtual void Delete()
		{
			DAOCargoLaboral daoCargoLaboral = new DAOCargoLaboral();
			RegisterDataObject(daoCargoLaboral);
			BeginTransaction("deleteBOCargoLaboral");
			try
			{
				daoCargoLaboral.Id = _id;
				daoCargoLaboral.Delete();
				CommitTransaction();
			}
			catch
			{
				RollbackTransaction("deleteBOCargoLaboral");
				throw;
			}
		}
		
		///<Summary>
		///CargoLaboralCollection
		///This method returns the collection of BOCargoLaboral objects
		///</Summary>
		///<returns>
		///List[BOCargoLaboral]
		///</returns>
		///<parameters>
		///
		///</parameters>
		public static List<BOCargoLaboral> CargoLaboralCollection()
		{
			List<BOCargoLaboral> boCargoLaboralCollection = new List<BOCargoLaboral>();
			List<DAOCargoLaboral> daoCargoLaboralCollection = DAOCargoLaboral.SelectAll();
			
			foreach(DAOCargoLaboral daoCargoLaboral in daoCargoLaboralCollection)
				boCargoLaboralCollection.Add(new BOCargoLaboral(daoCargoLaboral));
			
			 return boCargoLaboralCollection;
			
		}
		
		
		///<Summary>
		///CargoLaboralCollectionCount
		///This method returns the collection count of BOCargoLaboral objects
		///</Summary>
		///<returns>
		///Int32
		///</returns>
		///<parameters>
		///
		///</parameters>
		public static Int32 CargoLaboralCollectionCount()
		{
			Int32 objCount = DAOCargoLaboral.SelectAllCount();
			return objCount;
			
		}
		
		
		public static List<BOCargoLaboral> CargoLaboralCollectionFromSearchFields(BOCargoLaboral boCargoLaboral)
		{
			List<BOCargoLaboral> boCargoLaboralCollection = new List<BOCargoLaboral>();
			DAOCargoLaboral daoCargoLaboral = new DAOCargoLaboral();
			daoCargoLaboral.Id = boCargoLaboral.Id;
			daoCargoLaboral.Nombre = boCargoLaboral.Nombre;
			List<DAOCargoLaboral> daoCargoLaboralCollection = DAOCargoLaboral.SelectAllBySearchFields(daoCargoLaboral);
			
			foreach(DAOCargoLaboral resdaoCargoLaboral in daoCargoLaboralCollection)
				boCargoLaboralCollection.Add(new BOCargoLaboral(resdaoCargoLaboral));
			
			return boCargoLaboralCollection;
			
		}
		
		
		public static Int32 CargoLaboralCollectionFromSearchFieldsCount(BOCargoLaboral boCargoLaboral)
		{
			DAOCargoLaboral daoCargoLaboral = new DAOCargoLaboral();
			daoCargoLaboral.Id = boCargoLaboral.Id;
			daoCargoLaboral.Nombre = boCargoLaboral.Nombre;
			Int32 objCount = DAOCargoLaboral.SelectAllBySearchFieldsCount(daoCargoLaboral);
			
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