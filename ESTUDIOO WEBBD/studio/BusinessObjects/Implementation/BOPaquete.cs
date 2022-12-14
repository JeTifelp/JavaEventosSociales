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
	///This is the definition of the class BOPaquete.
	///</Summary>
	public partial class BOPaquete : DATACONN0_BaseBusiness
	{
		#region member variables
		protected Int32? _id;
		protected string _nombre;
		protected decimal? _precio;
		protected decimal? _descuento;
		protected decimal? _precioTotal;
		protected bool? _generico;
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
		public BOPaquete()
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
		///Int32 id
		///</parameters>
		public BOPaquete(Int32 id)
		{
			try
			{
				DAOPaquete daoPaquete = DAOPaquete.SelectOne(id);
				_id = daoPaquete.Id;
				_nombre = daoPaquete.Nombre;
				_precio = daoPaquete.Precio;
				_descuento = daoPaquete.Descuento;
				_precioTotal = daoPaquete.PrecioTotal;
				_generico = daoPaquete.Generico;
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
		public BOPaquete(string nombre)
		{
			try
			{
				DAOPaquete daoPaquete = DAOPaquete.SelectOneByNombre(nombre);
				_id = daoPaquete.Id;
				_nombre = daoPaquete.Nombre;
				_precio = daoPaquete.Precio;
				_descuento = daoPaquete.Descuento;
				_precioTotal = daoPaquete.PrecioTotal;
				_generico = daoPaquete.Generico;
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
		///DAOPaquete
		///</parameters>
		protected internal BOPaquete(DAOPaquete daoPaquete)
		{
			try
			{
				_id = daoPaquete.Id;
				_nombre = daoPaquete.Nombre;
				_precio = daoPaquete.Precio;
				_descuento = daoPaquete.Descuento;
				_precioTotal = daoPaquete.PrecioTotal;
				_generico = daoPaquete.Generico;
			}
			catch
			{
				throw;
			}
		}

		///<Summary>
		///SaveNew
		///This method persists a new Paquete record to the store
		///</Summary>
		///<returns>
		///void
		///</returns>
		///<parameters>
		///
		///</parameters>
		public virtual void SaveNew()
		{
			DAOPaquete daoPaquete = new DAOPaquete();
			RegisterDataObject(daoPaquete);
			BeginTransaction("savenewBOPaquete");
			try
			{
				daoPaquete.Nombre = _nombre;
				daoPaquete.Precio = _precio;
				daoPaquete.Descuento = _descuento;
				daoPaquete.PrecioTotal = _precioTotal;
				daoPaquete.Generico = _generico;
				daoPaquete.Insert();
				CommitTransaction();
				
				_id = daoPaquete.Id;
				_nombre = daoPaquete.Nombre;
				_precio = daoPaquete.Precio;
				_descuento = daoPaquete.Descuento;
				_precioTotal = daoPaquete.PrecioTotal;
				_generico = daoPaquete.Generico;
				_isDirty = false;
			}
			catch
			{
				RollbackTransaction("savenewBOPaquete");
				throw;
			}
		}
		
		///<Summary>
		///Update
		///This method updates one Paquete record in the store
		///</Summary>
		///<returns>
		///void
		///</returns>
		///<parameters>
		///BOPaquete
		///</parameters>
		public virtual void Update()
		{
			DAOPaquete daoPaquete = new DAOPaquete();
			RegisterDataObject(daoPaquete);
			BeginTransaction("updateBOPaquete");
			try
			{
				daoPaquete.Id = _id;
				daoPaquete.Nombre = _nombre;
				daoPaquete.Precio = _precio;
				daoPaquete.Descuento = _descuento;
				daoPaquete.PrecioTotal = _precioTotal;
				daoPaquete.Generico = _generico;
				daoPaquete.Update();
				CommitTransaction();
				
				_id = daoPaquete.Id;
				_nombre = daoPaquete.Nombre;
				_precio = daoPaquete.Precio;
				_descuento = daoPaquete.Descuento;
				_precioTotal = daoPaquete.PrecioTotal;
				_generico = daoPaquete.Generico;
				_isDirty = false;
			}
			catch
			{
				RollbackTransaction("updateBOPaquete");
				throw;
			}
		}
		///<Summary>
		///Delete
		///This method deletes one Paquete record from the store
		///</Summary>
		///<returns>
		///void
		///</returns>
		///<parameters>
		///
		///</parameters>
		public virtual void Delete()
		{
			DAOPaquete daoPaquete = new DAOPaquete();
			RegisterDataObject(daoPaquete);
			BeginTransaction("deleteBOPaquete");
			try
			{
				daoPaquete.Id = _id;
				daoPaquete.Delete();
				CommitTransaction();
			}
			catch
			{
				RollbackTransaction("deleteBOPaquete");
				throw;
			}
		}
		
		///<Summary>
		///PaqueteCollection
		///This method returns the collection of BOPaquete objects
		///</Summary>
		///<returns>
		///List[BOPaquete]
		///</returns>
		///<parameters>
		///
		///</parameters>
		public static List<BOPaquete> PaqueteCollection()
		{
			List<BOPaquete> boPaqueteCollection = new List<BOPaquete>();
			List<DAOPaquete> daoPaqueteCollection = DAOPaquete.SelectAll();
			
			foreach(DAOPaquete daoPaquete in daoPaqueteCollection)
				boPaqueteCollection.Add(new BOPaquete(daoPaquete));
			
			 return boPaqueteCollection;
			
		}
		
		
		///<Summary>
		///PaqueteCollectionCount
		///This method returns the collection count of BOPaquete objects
		///</Summary>
		///<returns>
		///Int32
		///</returns>
		///<parameters>
		///
		///</parameters>
		public static Int32 PaqueteCollectionCount()
		{
			Int32 objCount = DAOPaquete.SelectAllCount();
			return objCount;
			
		}
		
		
		public static List<BOPaquete> PaqueteCollectionFromSearchFields(BOPaquete boPaquete)
		{
			List<BOPaquete> boPaqueteCollection = new List<BOPaquete>();
			DAOPaquete daoPaquete = new DAOPaquete();
			daoPaquete.Id = boPaquete.Id;
			daoPaquete.Nombre = boPaquete.Nombre;
			daoPaquete.Precio = boPaquete.Precio;
			daoPaquete.Descuento = boPaquete.Descuento;
			daoPaquete.PrecioTotal = boPaquete.PrecioTotal;
			daoPaquete.Generico = boPaquete.Generico;
			List<DAOPaquete> daoPaqueteCollection = DAOPaquete.SelectAllBySearchFields(daoPaquete);
			
			foreach(DAOPaquete resdaoPaquete in daoPaqueteCollection)
				boPaqueteCollection.Add(new BOPaquete(resdaoPaquete));
			
			return boPaqueteCollection;
			
		}
		
		
		public static Int32 PaqueteCollectionFromSearchFieldsCount(BOPaquete boPaquete)
		{
			DAOPaquete daoPaquete = new DAOPaquete();
			daoPaquete.Id = boPaquete.Id;
			daoPaquete.Nombre = boPaquete.Nombre;
			daoPaquete.Precio = boPaquete.Precio;
			daoPaquete.Descuento = boPaquete.Descuento;
			daoPaquete.PrecioTotal = boPaquete.PrecioTotal;
			daoPaquete.Generico = boPaquete.Generico;
			Int32 objCount = DAOPaquete.SelectAllBySearchFieldsCount(daoPaquete);
			
			return objCount;
			
		}
		
		#endregion

		#region member properties
		
		public virtual Int32? Id
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
		
		public virtual decimal? Descuento
		{
			get
			{
				 return _descuento;
			}
			set
			{
				_descuento = value;
				_isDirty = true;
			}
		}
		
		public virtual decimal? PrecioTotal
		{
			get
			{
				 return _precioTotal;
			}
			set
			{
				_precioTotal = value;
				_isDirty = true;
			}
		}
		
		public virtual bool? Generico
		{
			get
			{
				 return _generico;
			}
			set
			{
				_generico = value;
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
