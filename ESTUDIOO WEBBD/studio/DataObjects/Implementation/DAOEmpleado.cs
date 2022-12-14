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
	public partial class DAOEmpleado : DATACONN0_BaseData
	{
		#region member variables
		protected string _ci;
		protected Int16? _idCL;
		protected DateTime? _fechaNac;
		protected decimal? _sueldo;
		protected DateTime? _fechaIng;
		#endregion

		#region class methods
		public DAOEmpleado()
		{
		}
		///<Summary>
		///Select one row by primary key(s)
		///This method returns one row from the table Empleado based on the primary key(s)
		///</Summary>
		///<returns>
		///DAOEmpleado
		///</returns>
		///<parameters>
		///string ci
		///</parameters>
		public static DAOEmpleado SelectOne(string ci)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprEmpleado_SelectOne;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			DataTable dt = new DataTable("Empleado");
			SqlDataAdapter sqlAdapter = new SqlDataAdapter(command);
			try
			{
				command.Parameters.Add(new SqlParameter("@CI", SqlDbType.VarChar, 10, ParameterDirection.Input, false, 0, 0, "", DataRowVersion.Proposed, (object)ci?? (object)DBNull.Value));

				staticConnection.Open();
				sqlAdapter.Fill(dt);


				DAOEmpleado retObj = null;
				if(dt.Rows.Count > 0)
				{
					retObj = new DAOEmpleado();
					retObj._ci					 = Convert.IsDBNull(dt.Rows[0]["CI"]) ? null : (string)dt.Rows[0]["CI"];
					retObj._idCL					 = Convert.IsDBNull(dt.Rows[0]["IdCL"]) ? (Int16?)null : (Int16?)dt.Rows[0]["IdCL"];
					retObj._fechaNac					 = Convert.IsDBNull(dt.Rows[0]["FechaNac"]) ? (DateTime?)null : (DateTime?)dt.Rows[0]["FechaNac"];
					retObj._sueldo					 = Convert.IsDBNull(dt.Rows[0]["Sueldo"]) ? (decimal?)null : (decimal?)dt.Rows[0]["Sueldo"];
					retObj._fechaIng					 = Convert.IsDBNull(dt.Rows[0]["FechaIng"]) ? (DateTime?)null : (DateTime?)dt.Rows[0]["FechaIng"];
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
		///this method allows the object to delete itself from the table Empleado based on its primary key
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
			command.CommandText = InlineProcs.ctprEmpleado_DeleteOne;
			command.CommandType = CommandType.Text;
			command.Connection = _connectionProvider.Connection;
			command.Transaction = _connectionProvider.CurrentTransaction;

			try
			{
				command.Parameters.Add(new SqlParameter("@CI", SqlDbType.VarChar, 10, ParameterDirection.Input, false, 0, 0, "", DataRowVersion.Proposed, (object)_ci?? (object)DBNull.Value));

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
		///This method returns all data rows in the table Empleado based on a foreign key
		///</Summary>
		///<returns>
		///List-DAOEmpleado.
		///</returns>
		///<parameters>
		///string ci
		///</parameters>
		public static List<DAOEmpleado> SelectAllByCi(string ci)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprEmpleado_SelectAllByCi;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			DataTable dt = new DataTable("Empleado");
			SqlDataAdapter sqlAdapter = new SqlDataAdapter(command);
			try
			{
				command.Parameters.Add(new SqlParameter("@CI", SqlDbType.VarChar, 10, ParameterDirection.Input, false, 0, 0, "", DataRowVersion.Proposed, (object)ci?? (object)DBNull.Value));

				staticConnection.Open();
				sqlAdapter.Fill(dt);


				List<DAOEmpleado> objList = new List<DAOEmpleado>();
				if(dt.Rows.Count > 0)
				{
					foreach(DataRow row in dt.Rows)
					{
						DAOEmpleado retObj = new DAOEmpleado();
						retObj._ci					 = Convert.IsDBNull(row["CI"]) ? null : (string)row["CI"];
						retObj._idCL					 = Convert.IsDBNull(row["IdCL"]) ? (Int16?)null : (Int16?)row["IdCL"];
						retObj._fechaNac					 = Convert.IsDBNull(row["FechaNac"]) ? (DateTime?)null : (DateTime?)row["FechaNac"];
						retObj._sueldo					 = Convert.IsDBNull(row["Sueldo"]) ? (decimal?)null : (decimal?)row["Sueldo"];
						retObj._fechaIng					 = Convert.IsDBNull(row["FechaIng"]) ? (DateTime?)null : (DateTime?)row["FechaIng"];
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
		///string ci
		///</parameters>
		public static Int32 SelectAllByCiCount(string ci)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprEmpleado_SelectAllByCiCount;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			try
			{
				command.Parameters.Add(new SqlParameter("@CI", SqlDbType.VarChar, 10, ParameterDirection.Input, false, 0, 0, "", DataRowVersion.Proposed, (object)ci?? (object)DBNull.Value));

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
		///This method deletes all rows in the table Empleado with a given foreign key
		///</Summary>
		///<returns>
		///void
		///</returns>
		///<parameters>
		///DATACONN0_TxConnectionProvider connectionProvider, string ci
		///</parameters>
		public static void DeleteAllByCi(DATACONN0_TxConnectionProvider connectionProvider, string ci)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprEmpleado_DeleteAllByCi;
			command.CommandType = CommandType.Text;
			command.Connection = connectionProvider.Connection;
			command.Transaction = connectionProvider.CurrentTransaction;

			try
			{
				command.Parameters.Add(new SqlParameter("@CI", SqlDbType.VarChar, 10, ParameterDirection.Input, false, 0, 0, "", DataRowVersion.Proposed, (object)ci?? (object)DBNull.Value));

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
		///This method returns all data rows in the table Empleado based on a foreign key
		///</Summary>
		///<returns>
		///List-DAOEmpleado.
		///</returns>
		///<parameters>
		///Int16? idCL
		///</parameters>
		public static List<DAOEmpleado> SelectAllByIdCL(Int16? idCL)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprEmpleado_SelectAllByIdCL;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			DataTable dt = new DataTable("Empleado");
			SqlDataAdapter sqlAdapter = new SqlDataAdapter(command);
			try
			{
				command.Parameters.Add(new SqlParameter("@IdCL", SqlDbType.SmallInt, 2, ParameterDirection.Input, false, 5, 0, "", DataRowVersion.Proposed, (object)idCL?? (object)DBNull.Value));

				staticConnection.Open();
				sqlAdapter.Fill(dt);


				List<DAOEmpleado> objList = new List<DAOEmpleado>();
				if(dt.Rows.Count > 0)
				{
					foreach(DataRow row in dt.Rows)
					{
						DAOEmpleado retObj = new DAOEmpleado();
						retObj._ci					 = Convert.IsDBNull(row["CI"]) ? null : (string)row["CI"];
						retObj._idCL					 = Convert.IsDBNull(row["IdCL"]) ? (Int16?)null : (Int16?)row["IdCL"];
						retObj._fechaNac					 = Convert.IsDBNull(row["FechaNac"]) ? (DateTime?)null : (DateTime?)row["FechaNac"];
						retObj._sueldo					 = Convert.IsDBNull(row["Sueldo"]) ? (decimal?)null : (decimal?)row["Sueldo"];
						retObj._fechaIng					 = Convert.IsDBNull(row["FechaIng"]) ? (DateTime?)null : (DateTime?)row["FechaIng"];
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
		///Int16? idCL
		///</parameters>
		public static Int32 SelectAllByIdCLCount(Int16? idCL)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprEmpleado_SelectAllByIdCLCount;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			try
			{
				command.Parameters.Add(new SqlParameter("@IdCL", SqlDbType.SmallInt, 2, ParameterDirection.Input, false, 5, 0, "", DataRowVersion.Proposed, (object)idCL?? (object)DBNull.Value));

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
		///This method deletes all rows in the table Empleado with a given foreign key
		///</Summary>
		///<returns>
		///void
		///</returns>
		///<parameters>
		///DATACONN0_TxConnectionProvider connectionProvider, Int16? idCL
		///</parameters>
		public static void DeleteAllByIdCL(DATACONN0_TxConnectionProvider connectionProvider, Int16? idCL)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprEmpleado_DeleteAllByIdCL;
			command.CommandType = CommandType.Text;
			command.Connection = connectionProvider.Connection;
			command.Transaction = connectionProvider.CurrentTransaction;

			try
			{
				command.Parameters.Add(new SqlParameter("@IdCL", SqlDbType.SmallInt, 2, ParameterDirection.Input, false, 5, 0, "", DataRowVersion.Proposed, (object)idCL?? (object)DBNull.Value));

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
		///This method saves a new object to the table Empleado
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
			command.CommandText = InlineProcs.ctprEmpleado_InsertOne;
			command.CommandType = CommandType.Text;
			command.Connection = _connectionProvider.Connection;
			command.Transaction = _connectionProvider.CurrentTransaction;

			try
			{
				command.Parameters.Add(new SqlParameter("@CI", SqlDbType.VarChar, 10, ParameterDirection.InputOutput, false, 0, 0, "", DataRowVersion.Proposed, (object)_ci?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@IdCL", SqlDbType.SmallInt, 2, ParameterDirection.InputOutput, false, 5, 0, "", DataRowVersion.Proposed, (object)_idCL?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@FechaNac", SqlDbType.DateTime, 3, ParameterDirection.InputOutput, false, 0, 0, "", DataRowVersion.Proposed, (object)_fechaNac?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@Sueldo", SqlDbType.Decimal, 9, ParameterDirection.InputOutput, false, 10, 2, "", DataRowVersion.Proposed, (object)_sueldo?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@FechaIng", SqlDbType.DateTime, 3, ParameterDirection.InputOutput, false, 0, 0, "", DataRowVersion.Proposed, (object)_fechaIng?? (object)DBNull.Value));

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
		///This method returns all data rows in the table Empleado
		///</Summary>
		///<returns>
		///List-DAOEmpleado.
		///</returns>
		///<parameters>
		///
		///</parameters>
		public static List<DAOEmpleado> SelectAll()
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprEmpleado_SelectAll;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			DataTable dt = new DataTable("Empleado");
			SqlDataAdapter sqlAdapter = new SqlDataAdapter(command);
			try
			{

				staticConnection.Open();
				sqlAdapter.Fill(dt);


				List<DAOEmpleado> objList = new List<DAOEmpleado>();
				if(dt.Rows.Count > 0)
				{
					foreach(DataRow row in dt.Rows)
					{
						DAOEmpleado retObj = new DAOEmpleado();
						retObj._ci					 = Convert.IsDBNull(row["CI"]) ? null : (string)row["CI"];
						retObj._idCL					 = Convert.IsDBNull(row["IdCL"]) ? (Int16?)null : (Int16?)row["IdCL"];
						retObj._fechaNac					 = Convert.IsDBNull(row["FechaNac"]) ? (DateTime?)null : (DateTime?)row["FechaNac"];
						retObj._sueldo					 = Convert.IsDBNull(row["Sueldo"]) ? (decimal?)null : (decimal?)row["Sueldo"];
						retObj._fechaIng					 = Convert.IsDBNull(row["FechaIng"]) ? (DateTime?)null : (DateTime?)row["FechaIng"];
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
			command.CommandText = InlineProcs.ctprEmpleado_SelectAllCount;
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
		///List-DAOEmpleado.
		///</returns>
		///<parameters>
		///DAOEmpleado daoEmpleado
		///</parameters>
		public static List<DAOEmpleado> SelectAllBySearchFields(DAOEmpleado daoEmpleado)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprEmpleado_SelectAllBySearchFields;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			DataTable dt = new DataTable("Empleado");
			SqlDataAdapter sqlAdapter = new SqlDataAdapter(command);
			try
			{
				command.Parameters.Add(new SqlParameter("@CI", SqlDbType.VarChar, 10, ParameterDirection.Input, false, 0, 0, "", DataRowVersion.Proposed, (object)daoEmpleado.Ci?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@IdCL", SqlDbType.SmallInt, 2, ParameterDirection.Input, false, 5, 0, "", DataRowVersion.Proposed, (object)daoEmpleado.IdCL?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@FechaNac", SqlDbType.DateTime, 3, ParameterDirection.Input, false, 0, 0, "", DataRowVersion.Proposed, (object)daoEmpleado.FechaNac?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@Sueldo", SqlDbType.Decimal, 9, ParameterDirection.Input, false, 10, 2, "", DataRowVersion.Proposed, (object)daoEmpleado.Sueldo?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@FechaIng", SqlDbType.DateTime, 3, ParameterDirection.Input, false, 0, 0, "", DataRowVersion.Proposed, (object)daoEmpleado.FechaIng?? (object)DBNull.Value));

				staticConnection.Open();
				sqlAdapter.Fill(dt);


				List<DAOEmpleado> objList = new List<DAOEmpleado>();
				if(dt.Rows.Count > 0)
				{
					foreach(DataRow row in dt.Rows)
					{
						DAOEmpleado retObj = new DAOEmpleado();
						retObj._ci					 = Convert.IsDBNull(row["CI"]) ? null : (string)row["CI"];
						retObj._idCL					 = Convert.IsDBNull(row["IdCL"]) ? (Int16?)null : (Int16?)row["IdCL"];
						retObj._fechaNac					 = Convert.IsDBNull(row["FechaNac"]) ? (DateTime?)null : (DateTime?)row["FechaNac"];
						retObj._sueldo					 = Convert.IsDBNull(row["Sueldo"]) ? (decimal?)null : (decimal?)row["Sueldo"];
						retObj._fechaIng					 = Convert.IsDBNull(row["FechaIng"]) ? (DateTime?)null : (DateTime?)row["FechaIng"];
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
		///DAOEmpleado daoEmpleado
		///</parameters>
		public static Int32 SelectAllBySearchFieldsCount(DAOEmpleado daoEmpleado)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprEmpleado_SelectAllBySearchFieldsCount;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			try
			{
				command.Parameters.Add(new SqlParameter("@CI", SqlDbType.VarChar, 10, ParameterDirection.Input, false, 0, 0, "", DataRowVersion.Proposed, (object)daoEmpleado.Ci?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@IdCL", SqlDbType.SmallInt, 2, ParameterDirection.Input, false, 5, 0, "", DataRowVersion.Proposed, (object)daoEmpleado.IdCL?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@FechaNac", SqlDbType.DateTime, 3, ParameterDirection.Input, false, 0, 0, "", DataRowVersion.Proposed, (object)daoEmpleado.FechaNac?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@Sueldo", SqlDbType.Decimal, 9, ParameterDirection.Input, false, 10, 2, "", DataRowVersion.Proposed, (object)daoEmpleado.Sueldo?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@FechaIng", SqlDbType.DateTime, 3, ParameterDirection.Input, false, 0, 0, "", DataRowVersion.Proposed, (object)daoEmpleado.FechaIng?? (object)DBNull.Value));

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
		///This method allows the object to update itself in the table Empleado based on its primary key(s)
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
			command.CommandText = InlineProcs.ctprEmpleado_UpdateOne;
			command.CommandType = CommandType.Text;
			command.Connection = _connectionProvider.Connection;
			command.Transaction = _connectionProvider.CurrentTransaction;

			try
			{
				command.Parameters.Add(new SqlParameter("@CI", SqlDbType.VarChar, 10, ParameterDirection.InputOutput, false, 0, 0, "", DataRowVersion.Proposed, (object)_ci?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@IdCL", SqlDbType.SmallInt, 2, ParameterDirection.InputOutput, false, 5, 0, "", DataRowVersion.Proposed, (object)_idCL?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@FechaNac", SqlDbType.DateTime, 3, ParameterDirection.InputOutput, false, 0, 0, "", DataRowVersion.Proposed, (object)_fechaNac?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@Sueldo", SqlDbType.Decimal, 9, ParameterDirection.InputOutput, false, 10, 2, "", DataRowVersion.Proposed, (object)_sueldo?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@FechaIng", SqlDbType.DateTime, 3, ParameterDirection.InputOutput, false, 0, 0, "", DataRowVersion.Proposed, (object)_fechaIng?? (object)DBNull.Value));

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

		public string Ci
		{
			get
			{
				return _ci;
			}
			set
			{
				_ci = value;
			}
		}

		public Int16? IdCL
		{
			get
			{
				return _idCL;
			}
			set
			{
				_idCL = value;
			}
		}

		public DateTime? FechaNac
		{
			get
			{
				return _fechaNac;
			}
			set
			{
				_fechaNac = value;
			}
		}

		public decimal? Sueldo
		{
			get
			{
				return _sueldo;
			}
			set
			{
				_sueldo = value;
			}
		}

		public DateTime? FechaIng
		{
			get
			{
				return _fechaIng;
			}
			set
			{
				_fechaIng = value;
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
		internal static string ctprEmpleado_SelectOne = @"
			-- Select one row based on the primary key(s)
			-- selects all rows from the table
			SELECT 
			[CI]
			,[IdCL]
			,[FechaNac]
			,[Sueldo]
			,[FechaIng]
			FROM [dbo].[Empleado]
			WHERE 
			[CI] = @CI
			";

		internal static string ctprEmpleado_DeleteOne = @"
			-- Delete a row based on the primary key(s)
			-- delete all matching from the table
			DELETE [dbo].[Empleado]
			WHERE 
			[CI] = @CI
			";

		internal static string ctprEmpleado_SelectAllByCi = @"
			-- Select all rows based on a foreign key
			-- selects all rows from the table
			SELECT 
			[CI]
			,[IdCL]
			,[FechaNac]
			,[Sueldo]
			,[FechaIng]
			FROM [dbo].[Empleado]
			WHERE 
			[CI] = @CI
			";

		internal static string ctprEmpleado_SelectAllByCiCount = @"
			-- Get count of rows returnable by this query
			-- selects count of all rows from the table
			SELECT COUNT(*)
			FROM [dbo].[Empleado]
			WHERE 
			[CI] = @CI
			";

		internal static string ctprEmpleado_DeleteAllByCi = @"
			
			-- delete all matching from the table
			DELETE [dbo].[Empleado]
			WHERE 
			[CI] = @CI
			";

		internal static string ctprEmpleado_SelectAllByIdCL = @"
			-- Select all rows based on a foreign key
			-- selects all rows from the table
			SELECT 
			[CI]
			,[IdCL]
			,[FechaNac]
			,[Sueldo]
			,[FechaIng]
			FROM [dbo].[Empleado]
			WHERE 
			[IdCL] = @IdCL
			";

		internal static string ctprEmpleado_SelectAllByIdCLCount = @"
			-- Get count of rows returnable by this query
			-- selects count of all rows from the table
			SELECT COUNT(*)
			FROM [dbo].[Empleado]
			WHERE 
			[IdCL] = @IdCL
			";

		internal static string ctprEmpleado_DeleteAllByIdCL = @"
			
			-- delete all matching from the table
			DELETE [dbo].[Empleado]
			WHERE 
			[IdCL] = @IdCL
			";

		internal static string ctprEmpleado_InsertOne = @"
			-- Insert a new row
			-- inserts a new row into the table
			INSERT [dbo].[Empleado]
			(
			[CI]
			,[IdCL]
			,[FechaNac]
			,[Sueldo]
			,[FechaIng]
			)
			VALUES
			(
			@CI
			,@IdCL
			,@FechaNac
			,@Sueldo
			,@FechaIng
			)
			SELECT 
			@CI = [CI]
			,@IdCL = [IdCL]
			,@FechaNac = [FechaNac]
			,@Sueldo = [Sueldo]
			,@FechaIng = [FechaIng]
			FROM [dbo].[Empleado]
			WHERE 
			[CI] = @CI
			";

		internal static string ctprEmpleado_SelectAll = @"
			-- Select All rows
			-- selects all rows from the table
			SELECT 
			[CI]
			,[IdCL]
			,[FechaNac]
			,[Sueldo]
			,[FechaIng]
			FROM [dbo].[Empleado]
			";

		internal static string ctprEmpleado_SelectAllCount = @"
			
			-- selects count of all rows from the table
			SELECT COUNT(*)
			FROM [dbo].[Empleado]
			";

		internal static string ctprEmpleado_SelectAllBySearchFields = @"
			
			-- selects all rows from the table according to search criteria
			SELECT 
			[CI],
			[IdCL],
			[FechaNac],
			[Sueldo],
			[FechaIng]
			FROM [dbo].[Empleado]
			WHERE 
			([CI] LIKE @CI OR @CI is null)
			AND ([IdCL] LIKE @IdCL OR @IdCL is null)
			AND ([FechaNac] LIKE @FechaNac OR @FechaNac is null)
			AND ([Sueldo] LIKE @Sueldo OR @Sueldo is null)
			AND ([FechaIng] LIKE @FechaIng OR @FechaIng is null)
			";

		internal static string ctprEmpleado_SelectAllBySearchFieldsCount = @"
			-- Get count of rows returnable by this query
			-- selects count of all rows from the table according to search criteria
			SELECT COUNT(*)
			FROM [dbo].[Empleado]
			WHERE 
			([CI] LIKE @CI OR @CI is null)
			AND ([IdCL] LIKE @IdCL OR @IdCL is null)
			AND ([FechaNac] LIKE @FechaNac OR @FechaNac is null)
			AND ([Sueldo] LIKE @Sueldo OR @Sueldo is null)
			AND ([FechaIng] LIKE @FechaIng OR @FechaIng is null)
			";

		internal static string ctprEmpleado_UpdateOne = @"
			-- Update one row based on the primary key(s)
			-- updates a row in the table based on the primary key
			
			UPDATE [dbo].[Empleado]
			SET
			[IdCL] = @IdCL
			,[FechaNac] = @FechaNac
			,[Sueldo] = @Sueldo
			,[FechaIng] = @FechaIng
			WHERE 
			[CI] = @CI
			SELECT 
			@CI = [CI]
			,@IdCL = [IdCL]
			,@FechaNac = [FechaNac]
			,@Sueldo = [Sueldo]
			,@FechaIng = [FechaIng]
			FROM [dbo].[Empleado]
			WHERE 
			[CI] = @CI
			";

	}
}
#endregion
