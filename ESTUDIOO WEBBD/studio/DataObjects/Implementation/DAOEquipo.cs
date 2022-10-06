/*************************************************************
** Class generated by CodeTrigger, Version 4.3.0.6
** CodeTrigger is an Exotechnic Corporation (UK) Ltd Product 
** This class was generated on 08/06/2014 17:05:12
** Changes to this file may cause incorrect behaviour and will be lost if the code is regenerated
**************************************************************/
using System;
using System.Data;
using System.Data.SqlClient;
using System.Collections.Generic;

namespace studio.DataObjects
{
	public partial class DAOEquipo : DATACONN0_BaseData
	{
		#region member variables
		protected Int16? _id;
		protected string _nombre;
		protected string _descripcion;
		protected bool? _disponible;
		protected Int16? _idTE;
		#endregion

		#region class methods
		public DAOEquipo()
		{
		}
		///<Summary>
		///Select one row by primary key(s)
		///This method returns one row from the table Equipo based on the primary key(s)
		///</Summary>
		///<returns>
		///DAOEquipo
		///</returns>
		///<parameters>
		///Int16? id
		///</parameters>
		public static DAOEquipo SelectOne(Int16? id)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprEquipo_SelectOne;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			DataTable dt = new DataTable("Equipo");
			SqlDataAdapter sqlAdapter = new SqlDataAdapter(command);
			try
			{
				command.Parameters.Add(new SqlParameter("@Id", SqlDbType.SmallInt, 2, ParameterDirection.Input, false, 5, 0, "", DataRowVersion.Proposed, (object)id?? (object)DBNull.Value));

				staticConnection.Open();
				sqlAdapter.Fill(dt);


				DAOEquipo retObj = null;
				if(dt.Rows.Count > 0)
				{
					retObj = new DAOEquipo();
					retObj._id					 = Convert.IsDBNull(dt.Rows[0]["Id"]) ? (Int16?)null : (Int16?)dt.Rows[0]["Id"];
					retObj._nombre					 = Convert.IsDBNull(dt.Rows[0]["Nombre"]) ? null : (string)dt.Rows[0]["Nombre"];
					retObj._descripcion					 = Convert.IsDBNull(dt.Rows[0]["Descripcion"]) ? null : (string)dt.Rows[0]["Descripcion"];
					retObj._disponible					 = Convert.IsDBNull(dt.Rows[0]["Disponible"]) ? (bool?)null : (bool?)dt.Rows[0]["Disponible"];
					retObj._idTE					 = Convert.IsDBNull(dt.Rows[0]["IdTE"]) ? (Int16?)null : (Int16?)dt.Rows[0]["IdTE"];
				}
				return retObj;
			}
			catch
			{
				throw;
			}
			finally
			{
				staticConnection.Close();
				command.Dispose();
			}
		}

		///<Summary>
		///Delete one row by primary key(s)
		///this method allows the object to delete itself from the table Equipo based on its primary key
		///</Summary>
		///<returns>
		///void
		///</returns>
		///<parameters>
		///
		///</parameters>
		public virtual void Delete()
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprEquipo_DeleteOne;
			command.CommandType = CommandType.Text;
			command.Connection = _connectionProvider.Connection;
			command.Transaction = _connectionProvider.CurrentTransaction;

			try
			{
				command.Parameters.Add(new SqlParameter("@Id", SqlDbType.SmallInt, 2, ParameterDirection.Input, false, 5, 0, "", DataRowVersion.Proposed, (object)_id?? (object)DBNull.Value));

				command.ExecuteNonQuery();


			}
			catch
			{
				throw;
			}
			finally
			{
				command.Dispose();
			}
		}

		///<Summary>
		///Select one row by unique constraint
		///This method returns one row from the table Equipo based on a unique constraint
		///</Summary>
		///<returns>
		///DAOEquipo
		///</returns>
		///<parameters>
		///string nombre, Int16? idTE
		///</parameters>
		public static DAOEquipo SelectOneByUniqueFields(string nombre, Int16? idTE)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprEquipo_SelectOneByUniqueFields;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			DataTable dt = new DataTable("Equipo");
			SqlDataAdapter sqlAdapter = new SqlDataAdapter(command);
			try
			{
				command.Parameters.Add(new SqlParameter("@Nombre", SqlDbType.VarChar, 50, ParameterDirection.Input, false, 0, 0, "", DataRowVersion.Proposed, (object)nombre?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@IdTE", SqlDbType.SmallInt, 2, ParameterDirection.Input, false, 5, 0, "", DataRowVersion.Proposed, (object)idTE?? (object)DBNull.Value));

				staticConnection.Open();
				sqlAdapter.Fill(dt);


				DAOEquipo retObj = null;
				if(dt.Rows.Count > 0)
				{
					retObj = new DAOEquipo();
					retObj._id					 = Convert.IsDBNull(dt.Rows[0]["Id"]) ? (Int16?)null : (Int16?)dt.Rows[0]["Id"];
					retObj._nombre					 = Convert.IsDBNull(dt.Rows[0]["Nombre"]) ? null : (string)dt.Rows[0]["Nombre"];
					retObj._descripcion					 = Convert.IsDBNull(dt.Rows[0]["Descripcion"]) ? null : (string)dt.Rows[0]["Descripcion"];
					retObj._disponible					 = Convert.IsDBNull(dt.Rows[0]["Disponible"]) ? (bool?)null : (bool?)dt.Rows[0]["Disponible"];
					retObj._idTE					 = Convert.IsDBNull(dt.Rows[0]["IdTE"]) ? (Int16?)null : (Int16?)dt.Rows[0]["IdTE"];
				}
				return retObj;
			}
			catch
			{
				throw;
			}
			finally
			{
				staticConnection.Close();
				command.Dispose();
			}
		}

		///<Summary>
		///Delete one row by unique constraint
		///This method deletes one row from the table Equipo based on a unique constraint
		///</Summary>
		///<returns>
		///void
		///</returns>
		///<parameters>
		///string nombre, Int16? idTE
		///</parameters>
		public virtual void DeleteOneByUniqueFields(string nombre, Int16? idTE)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprEquipo_DeleteOneByUniqueFields;
			command.CommandType = CommandType.Text;
			command.Connection = _connectionProvider.Connection;
			command.Transaction = _connectionProvider.CurrentTransaction;

			try
			{
				command.Parameters.Add(new SqlParameter("@Nombre", SqlDbType.VarChar, 50, ParameterDirection.Input, false, 0, 0, "", DataRowVersion.Proposed, (object)_nombre?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@IdTE", SqlDbType.SmallInt, 2, ParameterDirection.Input, false, 5, 0, "", DataRowVersion.Proposed, (object)_idTE?? (object)DBNull.Value));

				command.ExecuteNonQuery();


			}
			catch
			{
				throw;
			}
			finally
			{
				command.Dispose();
			}
		}

		///<Summary>
		///Insert a new row
		///This method saves a new object to the table Equipo
		///</Summary>
		///<returns>
		///void
		///</returns>
		///<parameters>
		///
		///</parameters>
		public virtual void Insert()
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprEquipo_InsertOne;
			command.CommandType = CommandType.Text;
			command.Connection = _connectionProvider.Connection;
			command.Transaction = _connectionProvider.CurrentTransaction;

			try
			{
				command.Parameters.Add(new SqlParameter("@Id", SqlDbType.SmallInt, 2, ParameterDirection.Output, false, 5, 0, "", DataRowVersion.Proposed, _id));
				command.Parameters.Add(new SqlParameter("@Nombre", SqlDbType.VarChar, 50, ParameterDirection.InputOutput, false, 0, 0, "", DataRowVersion.Proposed, (object)_nombre?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@Descripcion", SqlDbType.VarChar, 50, ParameterDirection.InputOutput, true, 0, 0, "", DataRowVersion.Proposed, (object)_descripcion?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@Disponible", SqlDbType.Bit, 1, ParameterDirection.InputOutput, false, 0, 0, "", DataRowVersion.Proposed, (object)_disponible?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@IdTE", SqlDbType.SmallInt, 2, ParameterDirection.InputOutput, false, 5, 0, "", DataRowVersion.Proposed, (object)_idTE?? (object)DBNull.Value));

				command.ExecuteNonQuery();

				_id = (Int16?)command.Parameters["@Id"].Value;

			}
			catch
			{
				throw;
			}
			finally
			{
				command.Dispose();
			}
		}

		///<Summary>
		///Select all rows
		///This method returns all data rows in the table Equipo
		///</Summary>
		///<returns>
		///List-DAOEquipo.
		///</returns>
		///<parameters>
		///
		///</parameters>
		public static List<DAOEquipo> SelectAll()
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprEquipo_SelectAll;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			DataTable dt = new DataTable("Equipo");
			SqlDataAdapter sqlAdapter = new SqlDataAdapter(command);
			try
			{

				staticConnection.Open();
				sqlAdapter.Fill(dt);


				List<DAOEquipo> objList = new List<DAOEquipo>();
				if(dt.Rows.Count > 0)
				{
					foreach(DataRow row in dt.Rows)
					{
						DAOEquipo retObj = new DAOEquipo();
						retObj._id					 = Convert.IsDBNull(row["Id"]) ? (Int16?)null : (Int16?)row["Id"];
						retObj._nombre					 = Convert.IsDBNull(row["Nombre"]) ? null : (string)row["Nombre"];
						retObj._descripcion					 = Convert.IsDBNull(row["Descripcion"]) ? null : (string)row["Descripcion"];
						retObj._disponible					 = Convert.IsDBNull(row["Disponible"]) ? (bool?)null : (bool?)row["Disponible"];
						retObj._idTE					 = Convert.IsDBNull(row["IdTE"]) ? (Int16?)null : (Int16?)row["IdTE"];
						objList.Add(retObj);
					}
				}
				return objList;
			}
			catch
			{
				throw;
			}
			finally
			{
				staticConnection.Close();
				command.Dispose();
			}
		}

		///<Summary>
		///</Summary>
		///<returns>
		///Int32
		///</returns>
		///<parameters>
		///
		///</parameters>
		public static Int32 SelectAllCount()
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprEquipo_SelectAllCount;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			try
			{

				staticConnection.Open();
				Int32 retCount = (Int32)command.ExecuteScalar();

				return retCount;			}
			catch
			{
				throw;
			}
			finally
			{
				staticConnection.Close();
				command.Dispose();
			}
		}

		///<Summary>
		///</Summary>
		///<returns>
		///List-DAOEquipo.
		///</returns>
		///<parameters>
		///DAOEquipo daoEquipo
		///</parameters>
		public static List<DAOEquipo> SelectAllBySearchFields(DAOEquipo daoEquipo)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprEquipo_SelectAllBySearchFields;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			DataTable dt = new DataTable("Equipo");
			SqlDataAdapter sqlAdapter = new SqlDataAdapter(command);
			try
			{
				command.Parameters.Add(new SqlParameter("@Id", SqlDbType.SmallInt, 2, ParameterDirection.Input, false, 5, 0, "", DataRowVersion.Proposed, (object)daoEquipo.Id?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@Nombre", SqlDbType.VarChar, 50, ParameterDirection.Input, false, 0, 0, "", DataRowVersion.Proposed, (object)daoEquipo.Nombre?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@Descripcion", SqlDbType.VarChar, 50, ParameterDirection.Input, true, 0, 0, "", DataRowVersion.Proposed, (object)daoEquipo.Descripcion?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@Disponible", SqlDbType.Bit, 1, ParameterDirection.Input, false, 0, 0, "", DataRowVersion.Proposed, (object)daoEquipo.Disponible?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@IdTE", SqlDbType.SmallInt, 2, ParameterDirection.Input, false, 5, 0, "", DataRowVersion.Proposed, (object)daoEquipo.IdTE?? (object)DBNull.Value));

				staticConnection.Open();
				sqlAdapter.Fill(dt);


				List<DAOEquipo> objList = new List<DAOEquipo>();
				if(dt.Rows.Count > 0)
				{
					foreach(DataRow row in dt.Rows)
					{
						DAOEquipo retObj = new DAOEquipo();
						retObj._id					 = Convert.IsDBNull(row["Id"]) ? (Int16?)null : (Int16?)row["Id"];
						retObj._nombre					 = Convert.IsDBNull(row["Nombre"]) ? null : (string)row["Nombre"];
						retObj._descripcion					 = Convert.IsDBNull(row["Descripcion"]) ? null : (string)row["Descripcion"];
						retObj._disponible					 = Convert.IsDBNull(row["Disponible"]) ? (bool?)null : (bool?)row["Disponible"];
						retObj._idTE					 = Convert.IsDBNull(row["IdTE"]) ? (Int16?)null : (Int16?)row["IdTE"];
						objList.Add(retObj);
					}
				}
				return objList;
			}
			catch
			{
				throw;
			}
			finally
			{
				staticConnection.Close();
				command.Dispose();
			}
		}

		///<Summary>
		///</Summary>
		///<returns>
		///Int32
		///</returns>
		///<parameters>
		///DAOEquipo daoEquipo
		///</parameters>
		public static Int32 SelectAllBySearchFieldsCount(DAOEquipo daoEquipo)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprEquipo_SelectAllBySearchFieldsCount;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			try
			{
				command.Parameters.Add(new SqlParameter("@Id", SqlDbType.SmallInt, 2, ParameterDirection.Input, false, 5, 0, "", DataRowVersion.Proposed, (object)daoEquipo.Id?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@Nombre", SqlDbType.VarChar, 50, ParameterDirection.Input, false, 0, 0, "", DataRowVersion.Proposed, (object)daoEquipo.Nombre?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@Descripcion", SqlDbType.VarChar, 50, ParameterDirection.Input, true, 0, 0, "", DataRowVersion.Proposed, (object)daoEquipo.Descripcion?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@Disponible", SqlDbType.Bit, 1, ParameterDirection.Input, false, 0, 0, "", DataRowVersion.Proposed, (object)daoEquipo.Disponible?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@IdTE", SqlDbType.SmallInt, 2, ParameterDirection.Input, false, 5, 0, "", DataRowVersion.Proposed, (object)daoEquipo.IdTE?? (object)DBNull.Value));

				staticConnection.Open();
				Int32 retCount = (Int32)command.ExecuteScalar();

				return retCount;			}
			catch
			{
				throw;
			}
			finally
			{
				staticConnection.Close();
				command.Dispose();
			}
		}

		///<Summary>
		///Update one row by primary key(s)
		///This method allows the object to update itself in the table Equipo based on its primary key(s)
		///</Summary>
		///<returns>
		///void
		///</returns>
		///<parameters>
		///
		///</parameters>
		public virtual void Update()
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprEquipo_UpdateOne;
			command.CommandType = CommandType.Text;
			command.Connection = _connectionProvider.Connection;
			command.Transaction = _connectionProvider.CurrentTransaction;

			try
			{
				command.Parameters.Add(new SqlParameter("@Id", SqlDbType.SmallInt, 2, ParameterDirection.InputOutput, false, 5, 0, "", DataRowVersion.Proposed, (object)_id?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@Nombre", SqlDbType.VarChar, 50, ParameterDirection.InputOutput, false, 0, 0, "", DataRowVersion.Proposed, (object)_nombre?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@Descripcion", SqlDbType.VarChar, 50, ParameterDirection.InputOutput, true, 0, 0, "", DataRowVersion.Proposed, (object)_descripcion?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@Disponible", SqlDbType.Bit, 1, ParameterDirection.InputOutput, false, 0, 0, "", DataRowVersion.Proposed, (object)_disponible?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@IdTE", SqlDbType.SmallInt, 2, ParameterDirection.InputOutput, false, 5, 0, "", DataRowVersion.Proposed, (object)_idTE?? (object)DBNull.Value));

				command.ExecuteNonQuery();

				_id = (Int16?)command.Parameters["@Id"].Value;

			}
			catch
			{
				throw;
			}
			finally
			{
				command.Dispose();
			}
		}

		#endregion

		#region member properties

		public Int16? Id
		{
			get
			{
				return _id;
			}
			set
			{
				_id = value;
			}
		}

		public string Nombre
		{
			get
			{
				return _nombre;
			}
			set
			{
				_nombre = value;
			}
		}

		public string Descripcion
		{
			get
			{
				return _descripcion;
			}
			set
			{
				_descripcion = value;
			}
		}

		public bool? Disponible
		{
			get
			{
				return _disponible;
			}
			set
			{
				_disponible = value;
			}
		}

		public Int16? IdTE
		{
			get
			{
				return _idTE;
			}
			set
			{
				_idTE = value;
			}
		}

		#endregion
	}
}

#region inline sql procs
namespace studio.DataObjects
{
	public partial class InlineProcs
	{
		internal static string ctprEquipo_SelectOne = @"
			-- Select one row based on the primary key(s)
			-- selects all rows from the table
			SELECT 
			[Id]
			,[Nombre]
			,[Descripcion]
			,[Disponible]
			,[IdTE]
			FROM [dbo].[Equipo]
			WHERE 
			[Id] = @Id
			";

		internal static string ctprEquipo_DeleteOne = @"
			-- Delete a row based on the primary key(s)
			-- delete all matching from the table
			DELETE [dbo].[Equipo]
			WHERE 
			[Id] = @Id
			";

		internal static string ctprEquipo_SelectOneByUniqueFields = @"
			-- Select one row by a unique constraint
			-- selects all rows from the table
			SELECT 
			[Id]
			,[Nombre]
			,[Descripcion]
			,[Disponible]
			,[IdTE]
			FROM [dbo].[Equipo]
			WHERE 
			[Nombre] = @Nombre
			AND [IdTE] = @IdTE
			";

		internal static string ctprEquipo_DeleteOneByUniqueFields = @"
			
			-- delete all matching from the table
			DELETE [dbo].[Equipo]
			WHERE 
			[Nombre] = @Nombre
			AND [IdTE] = @IdTE
			";

		internal static string ctprEquipo_InsertOne = @"
			-- Insert a new row
			-- inserts a new row into the table
			INSERT [dbo].[Equipo]
			(
			[Nombre]
			,[Descripcion]
			,[Disponible]
			,[IdTE]
			)
			VALUES
			(
			@Nombre
			,@Descripcion
			,@Disponible
			,@IdTE
			)
			SELECT 
			@Id = [Id]
			,@Nombre = [Nombre]
			,@Descripcion = [Descripcion]
			,@Disponible = [Disponible]
			,@IdTE = [IdTE]
			FROM [dbo].[Equipo]
			WHERE 
			Id = SCOPE_IDENTITY()
			";

		internal static string ctprEquipo_SelectAll = @"
			-- Select All rows
			-- selects all rows from the table
			SELECT 
			[Id]
			,[Nombre]
			,[Descripcion]
			,[Disponible]
			,[IdTE]
			FROM [dbo].[Equipo]
			";

		internal static string ctprEquipo_SelectAllCount = @"
			
			-- selects count of all rows from the table
			SELECT COUNT(*)
			FROM [dbo].[Equipo]
			";

		internal static string ctprEquipo_SelectAllBySearchFields = @"
			
			-- selects all rows from the table according to search criteria
			SELECT 
			[Id],
			[Nombre],
			[Descripcion],
			[Disponible],
			[IdTE]
			FROM [dbo].[Equipo]
			WHERE 
			([Id] LIKE @Id OR @Id is null)
			AND ([Nombre] LIKE @Nombre OR @Nombre is null)
			AND ([Descripcion] LIKE @Descripcion OR @Descripcion is null)
			AND ([Disponible] LIKE @Disponible OR @Disponible is null)
			AND ([IdTE] LIKE @IdTE OR @IdTE is null)
			";

		internal static string ctprEquipo_SelectAllBySearchFieldsCount = @"
			-- Get count of rows returnable by this query
			-- selects count of all rows from the table according to search criteria
			SELECT COUNT(*)
			FROM [dbo].[Equipo]
			WHERE 
			([Id] LIKE @Id OR @Id is null)
			AND ([Nombre] LIKE @Nombre OR @Nombre is null)
			AND ([Descripcion] LIKE @Descripcion OR @Descripcion is null)
			AND ([Disponible] LIKE @Disponible OR @Disponible is null)
			AND ([IdTE] LIKE @IdTE OR @IdTE is null)
			";

		internal static string ctprEquipo_UpdateOne = @"
			-- Update one row based on the primary key(s)
			-- updates a row in the table based on the primary key
			
			UPDATE [dbo].[Equipo]
			SET
			[Nombre] = @Nombre
			,[Descripcion] = @Descripcion
			,[Disponible] = @Disponible
			,[IdTE] = @IdTE
			WHERE 
			[Id] = @Id
			SELECT 
			@Id = [Id]
			,@Nombre = [Nombre]
			,@Descripcion = [Descripcion]
			,@Disponible = [Disponible]
			,@IdTE = [IdTE]
			FROM [dbo].[Equipo]
			WHERE 
			[Id] = @Id
			";

	}
}
#endregion
