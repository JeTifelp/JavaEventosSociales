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
	public partial class DAOIncluyePC : DATACONN0_BaseData
	{
		#region member variables
		protected Int32? _idPaq;
		protected Int16? _idCP;
		protected Int16? _cantidad;
		#endregion

		#region class methods
		public DAOIncluyePC()
		{
		}
		///<Summary>
		///Select one row by primary key(s)
		///This method returns one row from the table IncluyePC based on the primary key(s)
		///</Summary>
		///<returns>
		///DAOIncluyePC
		///</returns>
		///<parameters>
		///Int32? idPaq, Int16? idCP
		///</parameters>
		public static DAOIncluyePC SelectOne(Int32? idPaq, Int16? idCP)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprIncluyePC_SelectOne;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			DataTable dt = new DataTable("IncluyePC");
			SqlDataAdapter sqlAdapter = new SqlDataAdapter(command);
			try
			{
				command.Parameters.Add(new SqlParameter("@IdPaq", SqlDbType.Int, 4, ParameterDirection.Input, false, 10, 0, "", DataRowVersion.Proposed, (object)idPaq?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@IdCP", SqlDbType.SmallInt, 2, ParameterDirection.Input, false, 5, 0, "", DataRowVersion.Proposed, (object)idCP?? (object)DBNull.Value));

				staticConnection.Open();
				sqlAdapter.Fill(dt);


				DAOIncluyePC retObj = null;
				if(dt.Rows.Count > 0)
				{
					retObj = new DAOIncluyePC();
					retObj._idPaq					 = Convert.IsDBNull(dt.Rows[0]["IdPaq"]) ? (Int32?)null : (Int32?)dt.Rows[0]["IdPaq"];
					retObj._idCP					 = Convert.IsDBNull(dt.Rows[0]["IdCP"]) ? (Int16?)null : (Int16?)dt.Rows[0]["IdCP"];
					retObj._cantidad					 = Convert.IsDBNull(dt.Rows[0]["Cantidad"]) ? (Int16?)null : (Int16?)dt.Rows[0]["Cantidad"];
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
		///this method allows the object to delete itself from the table IncluyePC based on its primary key
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
			command.CommandText = InlineProcs.ctprIncluyePC_DeleteOne;
			command.CommandType = CommandType.Text;
			command.Connection = _connectionProvider.Connection;
			command.Transaction = _connectionProvider.CurrentTransaction;

			try
			{
				command.Parameters.Add(new SqlParameter("@IdPaq", SqlDbType.Int, 4, ParameterDirection.Input, false, 10, 0, "", DataRowVersion.Proposed, (object)_idPaq?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@IdCP", SqlDbType.SmallInt, 2, ParameterDirection.Input, false, 5, 0, "", DataRowVersion.Proposed, (object)_idCP?? (object)DBNull.Value));

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
		///Select all rows by foreign key
		///This method returns all data rows in the table IncluyePC based on a foreign key
		///</Summary>
		///<returns>
		///List-DAOIncluyePC.
		///</returns>
		///<parameters>
		///Int32? idPaq
		///</parameters>
		public static List<DAOIncluyePC> SelectAllByIdPaq(Int32? idPaq)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprIncluyePC_SelectAllByIdPaq;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			DataTable dt = new DataTable("IncluyePC");
			SqlDataAdapter sqlAdapter = new SqlDataAdapter(command);
			try
			{
				command.Parameters.Add(new SqlParameter("@IdPaq", SqlDbType.Int, 4, ParameterDirection.Input, false, 10, 0, "", DataRowVersion.Proposed, (object)idPaq?? (object)DBNull.Value));

				staticConnection.Open();
				sqlAdapter.Fill(dt);


				List<DAOIncluyePC> objList = new List<DAOIncluyePC>();
				if(dt.Rows.Count > 0)
				{
					foreach(DataRow row in dt.Rows)
					{
						DAOIncluyePC retObj = new DAOIncluyePC();
						retObj._idPaq					 = Convert.IsDBNull(row["IdPaq"]) ? (Int32?)null : (Int32?)row["IdPaq"];
						retObj._idCP					 = Convert.IsDBNull(row["IdCP"]) ? (Int16?)null : (Int16?)row["IdCP"];
						retObj._cantidad					 = Convert.IsDBNull(row["Cantidad"]) ? (Int16?)null : (Int16?)row["Cantidad"];
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
		///Int32? idPaq
		///</parameters>
		public static Int32 SelectAllByIdPaqCount(Int32? idPaq)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprIncluyePC_SelectAllByIdPaqCount;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			try
			{
				command.Parameters.Add(new SqlParameter("@IdPaq", SqlDbType.Int, 4, ParameterDirection.Input, false, 10, 0, "", DataRowVersion.Proposed, (object)idPaq?? (object)DBNull.Value));

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
		///Delete all by foreign key
		///This method deletes all rows in the table IncluyePC with a given foreign key
		///</Summary>
		///<returns>
		///void
		///</returns>
		///<parameters>
		///DATACONN0_TxConnectionProvider connectionProvider, Int32? idPaq
		///</parameters>
		public static void DeleteAllByIdPaq(DATACONN0_TxConnectionProvider connectionProvider, Int32? idPaq)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprIncluyePC_DeleteAllByIdPaq;
			command.CommandType = CommandType.Text;
			command.Connection = connectionProvider.Connection;
			command.Transaction = connectionProvider.CurrentTransaction;

			try
			{
				command.Parameters.Add(new SqlParameter("@IdPaq", SqlDbType.Int, 4, ParameterDirection.Input, false, 10, 0, "", DataRowVersion.Proposed, (object)idPaq?? (object)DBNull.Value));

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
		///Select all rows by foreign key
		///This method returns all data rows in the table IncluyePC based on a foreign key
		///</Summary>
		///<returns>
		///List-DAOIncluyePC.
		///</returns>
		///<parameters>
		///Int16? idCP
		///</parameters>
		public static List<DAOIncluyePC> SelectAllByIdCP(Int16? idCP)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprIncluyePC_SelectAllByIdCP;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			DataTable dt = new DataTable("IncluyePC");
			SqlDataAdapter sqlAdapter = new SqlDataAdapter(command);
			try
			{
				command.Parameters.Add(new SqlParameter("@IdCP", SqlDbType.SmallInt, 2, ParameterDirection.Input, false, 5, 0, "", DataRowVersion.Proposed, (object)idCP?? (object)DBNull.Value));

				staticConnection.Open();
				sqlAdapter.Fill(dt);


				List<DAOIncluyePC> objList = new List<DAOIncluyePC>();
				if(dt.Rows.Count > 0)
				{
					foreach(DataRow row in dt.Rows)
					{
						DAOIncluyePC retObj = new DAOIncluyePC();
						retObj._idPaq					 = Convert.IsDBNull(row["IdPaq"]) ? (Int32?)null : (Int32?)row["IdPaq"];
						retObj._idCP					 = Convert.IsDBNull(row["IdCP"]) ? (Int16?)null : (Int16?)row["IdCP"];
						retObj._cantidad					 = Convert.IsDBNull(row["Cantidad"]) ? (Int16?)null : (Int16?)row["Cantidad"];
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
		///Int16? idCP
		///</parameters>
		public static Int32 SelectAllByIdCPCount(Int16? idCP)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprIncluyePC_SelectAllByIdCPCount;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			try
			{
				command.Parameters.Add(new SqlParameter("@IdCP", SqlDbType.SmallInt, 2, ParameterDirection.Input, false, 5, 0, "", DataRowVersion.Proposed, (object)idCP?? (object)DBNull.Value));

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
		///Delete all by foreign key
		///This method deletes all rows in the table IncluyePC with a given foreign key
		///</Summary>
		///<returns>
		///void
		///</returns>
		///<parameters>
		///DATACONN0_TxConnectionProvider connectionProvider, Int16? idCP
		///</parameters>
		public static void DeleteAllByIdCP(DATACONN0_TxConnectionProvider connectionProvider, Int16? idCP)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprIncluyePC_DeleteAllByIdCP;
			command.CommandType = CommandType.Text;
			command.Connection = connectionProvider.Connection;
			command.Transaction = connectionProvider.CurrentTransaction;

			try
			{
				command.Parameters.Add(new SqlParameter("@IdCP", SqlDbType.SmallInt, 2, ParameterDirection.Input, false, 5, 0, "", DataRowVersion.Proposed, (object)idCP?? (object)DBNull.Value));

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
		///This method saves a new object to the table IncluyePC
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
			command.CommandText = InlineProcs.ctprIncluyePC_InsertOne;
			command.CommandType = CommandType.Text;
			command.Connection = _connectionProvider.Connection;
			command.Transaction = _connectionProvider.CurrentTransaction;

			try
			{
				command.Parameters.Add(new SqlParameter("@IdPaq", SqlDbType.Int, 4, ParameterDirection.InputOutput, false, 10, 0, "", DataRowVersion.Proposed, (object)_idPaq?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@IdCP", SqlDbType.SmallInt, 2, ParameterDirection.InputOutput, false, 5, 0, "", DataRowVersion.Proposed, (object)_idCP?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@Cantidad", SqlDbType.SmallInt, 2, ParameterDirection.InputOutput, false, 5, 0, "", DataRowVersion.Proposed, (object)_cantidad?? (object)DBNull.Value));

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
		///Select all rows
		///This method returns all data rows in the table IncluyePC
		///</Summary>
		///<returns>
		///List-DAOIncluyePC.
		///</returns>
		///<parameters>
		///
		///</parameters>
		public static List<DAOIncluyePC> SelectAll()
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprIncluyePC_SelectAll;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			DataTable dt = new DataTable("IncluyePC");
			SqlDataAdapter sqlAdapter = new SqlDataAdapter(command);
			try
			{

				staticConnection.Open();
				sqlAdapter.Fill(dt);


				List<DAOIncluyePC> objList = new List<DAOIncluyePC>();
				if(dt.Rows.Count > 0)
				{
					foreach(DataRow row in dt.Rows)
					{
						DAOIncluyePC retObj = new DAOIncluyePC();
						retObj._idPaq					 = Convert.IsDBNull(row["IdPaq"]) ? (Int32?)null : (Int32?)row["IdPaq"];
						retObj._idCP					 = Convert.IsDBNull(row["IdCP"]) ? (Int16?)null : (Int16?)row["IdCP"];
						retObj._cantidad					 = Convert.IsDBNull(row["Cantidad"]) ? (Int16?)null : (Int16?)row["Cantidad"];
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
			command.CommandText = InlineProcs.ctprIncluyePC_SelectAllCount;
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
		///List-DAOIncluyePC.
		///</returns>
		///<parameters>
		///DAOIncluyePC daoIncluyePC
		///</parameters>
		public static List<DAOIncluyePC> SelectAllBySearchFields(DAOIncluyePC daoIncluyePC)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprIncluyePC_SelectAllBySearchFields;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			DataTable dt = new DataTable("IncluyePC");
			SqlDataAdapter sqlAdapter = new SqlDataAdapter(command);
			try
			{
				command.Parameters.Add(new SqlParameter("@IdPaq", SqlDbType.Int, 4, ParameterDirection.Input, false, 10, 0, "", DataRowVersion.Proposed, (object)daoIncluyePC.IdPaq?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@IdCP", SqlDbType.SmallInt, 2, ParameterDirection.Input, false, 5, 0, "", DataRowVersion.Proposed, (object)daoIncluyePC.IdCP?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@Cantidad", SqlDbType.SmallInt, 2, ParameterDirection.Input, false, 5, 0, "", DataRowVersion.Proposed, (object)daoIncluyePC.Cantidad?? (object)DBNull.Value));

				staticConnection.Open();
				sqlAdapter.Fill(dt);


				List<DAOIncluyePC> objList = new List<DAOIncluyePC>();
				if(dt.Rows.Count > 0)
				{
					foreach(DataRow row in dt.Rows)
					{
						DAOIncluyePC retObj = new DAOIncluyePC();
						retObj._idPaq					 = Convert.IsDBNull(row["IdPaq"]) ? (Int32?)null : (Int32?)row["IdPaq"];
						retObj._idCP					 = Convert.IsDBNull(row["IdCP"]) ? (Int16?)null : (Int16?)row["IdCP"];
						retObj._cantidad					 = Convert.IsDBNull(row["Cantidad"]) ? (Int16?)null : (Int16?)row["Cantidad"];
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
		///DAOIncluyePC daoIncluyePC
		///</parameters>
		public static Int32 SelectAllBySearchFieldsCount(DAOIncluyePC daoIncluyePC)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprIncluyePC_SelectAllBySearchFieldsCount;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			try
			{
				command.Parameters.Add(new SqlParameter("@IdPaq", SqlDbType.Int, 4, ParameterDirection.Input, false, 10, 0, "", DataRowVersion.Proposed, (object)daoIncluyePC.IdPaq?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@IdCP", SqlDbType.SmallInt, 2, ParameterDirection.Input, false, 5, 0, "", DataRowVersion.Proposed, (object)daoIncluyePC.IdCP?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@Cantidad", SqlDbType.SmallInt, 2, ParameterDirection.Input, false, 5, 0, "", DataRowVersion.Proposed, (object)daoIncluyePC.Cantidad?? (object)DBNull.Value));

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
		///This method allows the object to update itself in the table IncluyePC based on its primary key(s)
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
			command.CommandText = InlineProcs.ctprIncluyePC_UpdateOne;
			command.CommandType = CommandType.Text;
			command.Connection = _connectionProvider.Connection;
			command.Transaction = _connectionProvider.CurrentTransaction;

			try
			{
				command.Parameters.Add(new SqlParameter("@IdPaq", SqlDbType.Int, 4, ParameterDirection.InputOutput, false, 10, 0, "", DataRowVersion.Proposed, (object)_idPaq?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@IdCP", SqlDbType.SmallInt, 2, ParameterDirection.InputOutput, false, 5, 0, "", DataRowVersion.Proposed, (object)_idCP?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@Cantidad", SqlDbType.SmallInt, 2, ParameterDirection.InputOutput, false, 5, 0, "", DataRowVersion.Proposed, (object)_cantidad?? (object)DBNull.Value));

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

		#endregion

		#region member properties

		public Int32? IdPaq
		{
			get
			{
				return _idPaq;
			}
			set
			{
				_idPaq = value;
			}
		}

		public Int16? IdCP
		{
			get
			{
				return _idCP;
			}
			set
			{
				_idCP = value;
			}
		}

		public Int16? Cantidad
		{
			get
			{
				return _cantidad;
			}
			set
			{
				_cantidad = value;
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
		internal static string ctprIncluyePC_SelectOne = @"
			-- Select one row based on the primary key(s)
			-- selects all rows from the table
			SELECT 
			[IdPaq]
			,[IdCP]
			,[Cantidad]
			FROM [dbo].[IncluyePC]
			WHERE 
			[IdPaq] = @IdPaq
			AND [IdCP] = @IdCP
			";

		internal static string ctprIncluyePC_DeleteOne = @"
			-- Delete a row based on the primary key(s)
			-- delete all matching from the table
			DELETE [dbo].[IncluyePC]
			WHERE 
			[IdPaq] = @IdPaq
			AND [IdCP] = @IdCP
			";

		internal static string ctprIncluyePC_SelectAllByIdPaq = @"
			-- Select all rows based on a foreign key
			-- selects all rows from the table
			SELECT 
			[IdPaq]
			,[IdCP]
			,[Cantidad]
			FROM [dbo].[IncluyePC]
			WHERE 
			[IdPaq] = @IdPaq
			";

		internal static string ctprIncluyePC_SelectAllByIdPaqCount = @"
			-- Get count of rows returnable by this query
			-- selects count of all rows from the table
			SELECT COUNT(*)
			FROM [dbo].[IncluyePC]
			WHERE 
			[IdPaq] = @IdPaq
			";

		internal static string ctprIncluyePC_DeleteAllByIdPaq = @"
			
			-- delete all matching from the table
			DELETE [dbo].[IncluyePC]
			WHERE 
			[IdPaq] = @IdPaq
			";

		internal static string ctprIncluyePC_SelectAllByIdCP = @"
			-- Select all rows based on a foreign key
			-- selects all rows from the table
			SELECT 
			[IdPaq]
			,[IdCP]
			,[Cantidad]
			FROM [dbo].[IncluyePC]
			WHERE 
			[IdCP] = @IdCP
			";

		internal static string ctprIncluyePC_SelectAllByIdCPCount = @"
			-- Get count of rows returnable by this query
			-- selects count of all rows from the table
			SELECT COUNT(*)
			FROM [dbo].[IncluyePC]
			WHERE 
			[IdCP] = @IdCP
			";

		internal static string ctprIncluyePC_DeleteAllByIdCP = @"
			
			-- delete all matching from the table
			DELETE [dbo].[IncluyePC]
			WHERE 
			[IdCP] = @IdCP
			";

		internal static string ctprIncluyePC_InsertOne = @"
			-- Insert a new row
			-- inserts a new row into the table
			INSERT [dbo].[IncluyePC]
			(
			[IdPaq]
			,[IdCP]
			,[Cantidad]
			)
			VALUES
			(
			@IdPaq
			,@IdCP
			,@Cantidad
			)
			SELECT 
			@IdPaq = [IdPaq]
			,@IdCP = [IdCP]
			,@Cantidad = [Cantidad]
			FROM [dbo].[IncluyePC]
			WHERE 
			[IdPaq] = @IdPaq
			AND [IdCP] = @IdCP
			";

		internal static string ctprIncluyePC_SelectAll = @"
			-- Select All rows
			-- selects all rows from the table
			SELECT 
			[IdPaq]
			,[IdCP]
			,[Cantidad]
			FROM [dbo].[IncluyePC]
			";

		internal static string ctprIncluyePC_SelectAllCount = @"
			
			-- selects count of all rows from the table
			SELECT COUNT(*)
			FROM [dbo].[IncluyePC]
			";

		internal static string ctprIncluyePC_SelectAllBySearchFields = @"
			
			-- selects all rows from the table according to search criteria
			SELECT 
			[IdPaq],
			[IdCP],
			[Cantidad]
			FROM [dbo].[IncluyePC]
			WHERE 
			([IdPaq] LIKE @IdPaq OR @IdPaq is null)
			AND ([IdCP] LIKE @IdCP OR @IdCP is null)
			AND ([Cantidad] LIKE @Cantidad OR @Cantidad is null)
			";

		internal static string ctprIncluyePC_SelectAllBySearchFieldsCount = @"
			-- Get count of rows returnable by this query
			-- selects count of all rows from the table according to search criteria
			SELECT COUNT(*)
			FROM [dbo].[IncluyePC]
			WHERE 
			([IdPaq] LIKE @IdPaq OR @IdPaq is null)
			AND ([IdCP] LIKE @IdCP OR @IdCP is null)
			AND ([Cantidad] LIKE @Cantidad OR @Cantidad is null)
			";

		internal static string ctprIncluyePC_UpdateOne = @"
			-- Update one row based on the primary key(s)
			-- updates a row in the table based on the primary key
			
			UPDATE [dbo].[IncluyePC]
			SET
			[Cantidad] = @Cantidad
			WHERE 
			[IdPaq] = @IdPaq
			AND [IdCP] = @IdCP
			SELECT 
			@IdPaq = [IdPaq]
			,@IdCP = [IdCP]
			,@Cantidad = [Cantidad]
			FROM [dbo].[IncluyePC]
			WHERE 
			[IdPaq] = @IdPaq
			AND [IdCP] = @IdCP
			";

	}
}
#endregion