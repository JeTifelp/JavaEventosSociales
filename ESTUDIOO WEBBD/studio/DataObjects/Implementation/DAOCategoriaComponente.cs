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
	public partial class DAOCategoriaComponente : DATACONN0_BaseData
	{
		#region member variables
		protected Int16? _id;
		protected string _nombre;
		#endregion

		#region class methods
		public DAOCategoriaComponente()
		{
		}
		///<Summary>
		///Select one row by primary key(s)
		///This method returns one row from the table CategoriaComponente based on the primary key(s)
		///</Summary>
		///<returns>
		///DAOCategoriaComponente
		///</returns>
		///<parameters>
		///Int16? id
		///</parameters>
		public static DAOCategoriaComponente SelectOne(Int16? id)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprCategoriaComponente_SelectOne;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			DataTable dt = new DataTable("CategoriaComponente");
			SqlDataAdapter sqlAdapter = new SqlDataAdapter(command);
			try
			{
				command.Parameters.Add(new SqlParameter("@Id", SqlDbType.SmallInt, 2, ParameterDirection.Input, false, 5, 0, "", DataRowVersion.Proposed, (object)id?? (object)DBNull.Value));

				staticConnection.Open();
				sqlAdapter.Fill(dt);


				DAOCategoriaComponente retObj = null;
				if(dt.Rows.Count > 0)
				{
					retObj = new DAOCategoriaComponente();
					retObj._id					 = Convert.IsDBNull(dt.Rows[0]["Id"]) ? (Int16?)null : (Int16?)dt.Rows[0]["Id"];
					retObj._nombre					 = Convert.IsDBNull(dt.Rows[0]["Nombre"]) ? null : (string)dt.Rows[0]["Nombre"];
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
		///this method allows the object to delete itself from the table CategoriaComponente based on its primary key
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
			command.CommandText = InlineProcs.ctprCategoriaComponente_DeleteOne;
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
		///This method returns one row from the table CategoriaComponente based on a unique constraint
		///</Summary>
		///<returns>
		///DAOCategoriaComponente
		///</returns>
		///<parameters>
		///string nombre
		///</parameters>
		public static DAOCategoriaComponente SelectOneByNombre(string nombre)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprCategoriaComponente_SelectOneByNombre;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			DataTable dt = new DataTable("CategoriaComponente");
			SqlDataAdapter sqlAdapter = new SqlDataAdapter(command);
			try
			{
				command.Parameters.Add(new SqlParameter("@Nombre", SqlDbType.VarChar, 50, ParameterDirection.Input, false, 0, 0, "", DataRowVersion.Proposed, (object)nombre?? (object)DBNull.Value));

				staticConnection.Open();
				sqlAdapter.Fill(dt);


				DAOCategoriaComponente retObj = null;
				if(dt.Rows.Count > 0)
				{
					retObj = new DAOCategoriaComponente();
					retObj._id					 = Convert.IsDBNull(dt.Rows[0]["Id"]) ? (Int16?)null : (Int16?)dt.Rows[0]["Id"];
					retObj._nombre					 = Convert.IsDBNull(dt.Rows[0]["Nombre"]) ? null : (string)dt.Rows[0]["Nombre"];
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
		///This method deletes one row from the table CategoriaComponente based on a unique constraint
		///</Summary>
		///<returns>
		///void
		///</returns>
		///<parameters>
		///string nombre
		///</parameters>
		public virtual void DeleteOneByNombre(string nombre)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprCategoriaComponente_DeleteOneByNombre;
			command.CommandType = CommandType.Text;
			command.Connection = _connectionProvider.Connection;
			command.Transaction = _connectionProvider.CurrentTransaction;

			try
			{
				command.Parameters.Add(new SqlParameter("@Nombre", SqlDbType.VarChar, 50, ParameterDirection.Input, false, 0, 0, "", DataRowVersion.Proposed, (object)_nombre?? (object)DBNull.Value));

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
		///This method saves a new object to the table CategoriaComponente
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
			command.CommandText = InlineProcs.ctprCategoriaComponente_InsertOne;
			command.CommandType = CommandType.Text;
			command.Connection = _connectionProvider.Connection;
			command.Transaction = _connectionProvider.CurrentTransaction;

			try
			{
				command.Parameters.Add(new SqlParameter("@Id", SqlDbType.SmallInt, 2, ParameterDirection.Output, false, 5, 0, "", DataRowVersion.Proposed, _id));
				command.Parameters.Add(new SqlParameter("@Nombre", SqlDbType.VarChar, 50, ParameterDirection.InputOutput, false, 0, 0, "", DataRowVersion.Proposed, (object)_nombre?? (object)DBNull.Value));

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
		///This method returns all data rows in the table CategoriaComponente
		///</Summary>
		///<returns>
		///List-DAOCategoriaComponente.
		///</returns>
		///<parameters>
		///
		///</parameters>
		public static List<DAOCategoriaComponente> SelectAll()
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprCategoriaComponente_SelectAll;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			DataTable dt = new DataTable("CategoriaComponente");
			SqlDataAdapter sqlAdapter = new SqlDataAdapter(command);
			try
			{

				staticConnection.Open();
				sqlAdapter.Fill(dt);


				List<DAOCategoriaComponente> objList = new List<DAOCategoriaComponente>();
				if(dt.Rows.Count > 0)
				{
					foreach(DataRow row in dt.Rows)
					{
						DAOCategoriaComponente retObj = new DAOCategoriaComponente();
						retObj._id					 = Convert.IsDBNull(row["Id"]) ? (Int16?)null : (Int16?)row["Id"];
						retObj._nombre					 = Convert.IsDBNull(row["Nombre"]) ? null : (string)row["Nombre"];
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
			command.CommandText = InlineProcs.ctprCategoriaComponente_SelectAllCount;
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
		///List-DAOCategoriaComponente.
		///</returns>
		///<parameters>
		///DAOCategoriaComponente daoCategoriaComponente
		///</parameters>
		public static List<DAOCategoriaComponente> SelectAllBySearchFields(DAOCategoriaComponente daoCategoriaComponente)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprCategoriaComponente_SelectAllBySearchFields;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			DataTable dt = new DataTable("CategoriaComponente");
			SqlDataAdapter sqlAdapter = new SqlDataAdapter(command);
			try
			{
				command.Parameters.Add(new SqlParameter("@Id", SqlDbType.SmallInt, 2, ParameterDirection.Input, false, 5, 0, "", DataRowVersion.Proposed, (object)daoCategoriaComponente.Id?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@Nombre", SqlDbType.VarChar, 50, ParameterDirection.Input, false, 0, 0, "", DataRowVersion.Proposed, (object)daoCategoriaComponente.Nombre?? (object)DBNull.Value));

				staticConnection.Open();
				sqlAdapter.Fill(dt);


				List<DAOCategoriaComponente> objList = new List<DAOCategoriaComponente>();
				if(dt.Rows.Count > 0)
				{
					foreach(DataRow row in dt.Rows)
					{
						DAOCategoriaComponente retObj = new DAOCategoriaComponente();
						retObj._id					 = Convert.IsDBNull(row["Id"]) ? (Int16?)null : (Int16?)row["Id"];
						retObj._nombre					 = Convert.IsDBNull(row["Nombre"]) ? null : (string)row["Nombre"];
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
		///DAOCategoriaComponente daoCategoriaComponente
		///</parameters>
		public static Int32 SelectAllBySearchFieldsCount(DAOCategoriaComponente daoCategoriaComponente)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprCategoriaComponente_SelectAllBySearchFieldsCount;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			try
			{
				command.Parameters.Add(new SqlParameter("@Id", SqlDbType.SmallInt, 2, ParameterDirection.Input, false, 5, 0, "", DataRowVersion.Proposed, (object)daoCategoriaComponente.Id?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@Nombre", SqlDbType.VarChar, 50, ParameterDirection.Input, false, 0, 0, "", DataRowVersion.Proposed, (object)daoCategoriaComponente.Nombre?? (object)DBNull.Value));

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
		///This method allows the object to update itself in the table CategoriaComponente based on its primary key(s)
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
			command.CommandText = InlineProcs.ctprCategoriaComponente_UpdateOne;
			command.CommandType = CommandType.Text;
			command.Connection = _connectionProvider.Connection;
			command.Transaction = _connectionProvider.CurrentTransaction;

			try
			{
				command.Parameters.Add(new SqlParameter("@Id", SqlDbType.SmallInt, 2, ParameterDirection.InputOutput, false, 5, 0, "", DataRowVersion.Proposed, (object)_id?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@Nombre", SqlDbType.VarChar, 50, ParameterDirection.InputOutput, false, 0, 0, "", DataRowVersion.Proposed, (object)_nombre?? (object)DBNull.Value));

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

		#endregion
	}
}

#region inline sql procs
namespace studio.DataObjects
{
	public partial class InlineProcs
	{
		internal static string ctprCategoriaComponente_SelectOne = @"
			-- Select one row based on the primary key(s)
			-- selects all rows from the table
			SELECT 
			[Id]
			,[Nombre]
			FROM [dbo].[CategoriaComponente]
			WHERE 
			[Id] = @Id
			";

		internal static string ctprCategoriaComponente_DeleteOne = @"
			-- Delete a row based on the primary key(s)
			-- delete all matching from the table
			DELETE [dbo].[CategoriaComponente]
			WHERE 
			[Id] = @Id
			";

		internal static string ctprCategoriaComponente_SelectOneByNombre = @"
			-- Select one row by a unique constraint
			-- selects all rows from the table
			SELECT 
			[Id]
			,[Nombre]
			FROM [dbo].[CategoriaComponente]
			WHERE 
			[Nombre] = @Nombre
			";

		internal static string ctprCategoriaComponente_DeleteOneByNombre = @"
			
			-- delete all matching from the table
			DELETE [dbo].[CategoriaComponente]
			WHERE 
			[Nombre] = @Nombre
			";

		internal static string ctprCategoriaComponente_InsertOne = @"
			-- Insert a new row
			-- inserts a new row into the table
			INSERT [dbo].[CategoriaComponente]
			(
			[Nombre]
			)
			VALUES
			(
			@Nombre
			)
			SELECT 
			@Id = [Id]
			,@Nombre = [Nombre]
			FROM [dbo].[CategoriaComponente]
			WHERE 
			Id = SCOPE_IDENTITY()
			";

		internal static string ctprCategoriaComponente_SelectAll = @"
			-- Select All rows
			-- selects all rows from the table
			SELECT 
			[Id]
			,[Nombre]
			FROM [dbo].[CategoriaComponente]
			";

		internal static string ctprCategoriaComponente_SelectAllCount = @"
			
			-- selects count of all rows from the table
			SELECT COUNT(*)
			FROM [dbo].[CategoriaComponente]
			";

		internal static string ctprCategoriaComponente_SelectAllBySearchFields = @"
			
			-- selects all rows from the table according to search criteria
			SELECT 
			[Id],
			[Nombre]
			FROM [dbo].[CategoriaComponente]
			WHERE 
			([Id] LIKE @Id OR @Id is null)
			AND ([Nombre] LIKE @Nombre OR @Nombre is null)
			";

		internal static string ctprCategoriaComponente_SelectAllBySearchFieldsCount = @"
			-- Get count of rows returnable by this query
			-- selects count of all rows from the table according to search criteria
			SELECT COUNT(*)
			FROM [dbo].[CategoriaComponente]
			WHERE 
			([Id] LIKE @Id OR @Id is null)
			AND ([Nombre] LIKE @Nombre OR @Nombre is null)
			";

		internal static string ctprCategoriaComponente_UpdateOne = @"
			-- Update one row based on the primary key(s)
			-- updates a row in the table based on the primary key
			
			UPDATE [dbo].[CategoriaComponente]
			SET
			[Nombre] = @Nombre
			WHERE 
			[Id] = @Id
			SELECT 
			@Id = [Id]
			,@Nombre = [Nombre]
			FROM [dbo].[CategoriaComponente]
			WHERE 
			[Id] = @Id
			";

	}
}
#endregion
