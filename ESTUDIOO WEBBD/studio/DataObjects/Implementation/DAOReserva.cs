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
	public partial class DAOReserva : DATACONN0_BaseData
	{
		#region member variables
		protected Int32? _id;
		protected DateTime? _fechaR;
		protected DateTime? _fechaE;
		protected Int16? _diasEspera;
		protected string _interasado;
		protected string _descripcion;
		#endregion

		#region class methods
		public DAOReserva()
		{
		}
		///<Summary>
		///Select one row by primary key(s)
		///This method returns one row from the table Reserva based on the primary key(s)
		///</Summary>
		///<returns>
		///DAOReserva
		///</returns>
		///<parameters>
		///Int32? id
		///</parameters>
		public static DAOReserva SelectOne(Int32? id)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprReserva_SelectOne;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			DataTable dt = new DataTable("Reserva");
			SqlDataAdapter sqlAdapter = new SqlDataAdapter(command);
			try
			{
				command.Parameters.Add(new SqlParameter("@Id", SqlDbType.Int, 4, ParameterDirection.Input, false, 10, 0, "", DataRowVersion.Proposed, (object)id?? (object)DBNull.Value));

				staticConnection.Open();
				sqlAdapter.Fill(dt);


				DAOReserva retObj = null;
				if(dt.Rows.Count > 0)
				{
					retObj = new DAOReserva();
					retObj._id					 = Convert.IsDBNull(dt.Rows[0]["Id"]) ? (Int32?)null : (Int32?)dt.Rows[0]["Id"];
					retObj._fechaR					 = Convert.IsDBNull(dt.Rows[0]["FechaR"]) ? (DateTime?)null : (DateTime?)dt.Rows[0]["FechaR"];
					retObj._fechaE					 = Convert.IsDBNull(dt.Rows[0]["FechaE"]) ? (DateTime?)null : (DateTime?)dt.Rows[0]["FechaE"];
					retObj._diasEspera					 = Convert.IsDBNull(dt.Rows[0]["DiasEspera"]) ? (Int16?)null : (Int16?)dt.Rows[0]["DiasEspera"];
					retObj._interasado					 = Convert.IsDBNull(dt.Rows[0]["Interasado"]) ? null : (string)dt.Rows[0]["Interasado"];
					retObj._descripcion					 = Convert.IsDBNull(dt.Rows[0]["Descripcion"]) ? null : (string)dt.Rows[0]["Descripcion"];
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
		///this method allows the object to delete itself from the table Reserva based on its primary key
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
			command.CommandText = InlineProcs.ctprReserva_DeleteOne;
			command.CommandType = CommandType.Text;
			command.Connection = _connectionProvider.Connection;
			command.Transaction = _connectionProvider.CurrentTransaction;

			try
			{
				command.Parameters.Add(new SqlParameter("@Id", SqlDbType.Int, 4, ParameterDirection.Input, false, 10, 0, "", DataRowVersion.Proposed, (object)_id?? (object)DBNull.Value));

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
		///This method saves a new object to the table Reserva
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
			command.CommandText = InlineProcs.PROC_INSERTAR_rReserva    ;
			command.CommandType = CommandType.Text;
			command.Connection = _connectionProvider.Connection;
			command.Transaction = _connectionProvider.CurrentTransaction;

			try
			{
				command.Parameters.Add(new SqlParameter("@Id", SqlDbType.Int, 4, ParameterDirection.InputOutput, false, 10, 0, "", DataRowVersion.Proposed, (object)_id?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@FechaR", SqlDbType.DateTime, 3, ParameterDirection.InputOutput, false, 0, 0, "", DataRowVersion.Proposed, (object)_fechaR?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@FechaE", SqlDbType.DateTime, 3, ParameterDirection.InputOutput, false, 0, 0, "", DataRowVersion.Proposed, (object)_fechaE?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@DiasEspera", SqlDbType.SmallInt, 2, ParameterDirection.InputOutput, true, 5, 0, "", DataRowVersion.Proposed, (object)_diasEspera?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@Interasado", SqlDbType.VarChar, 4000, ParameterDirection.InputOutput, false, 0, 0, "", DataRowVersion.Proposed, (object)_interasado?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@Descripcion", SqlDbType.VarChar, 4000, ParameterDirection.InputOutput, false, 0, 0, "", DataRowVersion.Proposed, (object)_descripcion?? (object)DBNull.Value));

				command.ExecuteNonQuery();


			}
			catch (Exception e)
			{
				throw e;
			}
			finally
			{

				command.Dispose();
			}
		}

		///<Summary>
		///Select all rows
		///This method returns all data rows in the table Reserva
		///</Summary>
		///<returns>
		///List-DAOReserva.
		///</returns>
		///<parameters>
		///
		///</parameters>
		public static List<DAOReserva> SelectAll()
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprReserva_SelectAll;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			DataTable dt = new DataTable("Reserva");
			SqlDataAdapter sqlAdapter = new SqlDataAdapter(command);
			try
			{

				staticConnection.Open();
				sqlAdapter.Fill(dt);


				List<DAOReserva> objList = new List<DAOReserva>();
				if(dt.Rows.Count > 0)
				{
					foreach(DataRow row in dt.Rows)
					{
						DAOReserva retObj = new DAOReserva();
						retObj._id					 = Convert.IsDBNull(row["Id"]) ? (Int32?)null : (Int32?)row["Id"];
						retObj._fechaR					 = Convert.IsDBNull(row["FechaR"]) ? (DateTime?)null : (DateTime?)row["FechaR"];
						retObj._fechaE					 = Convert.IsDBNull(row["FechaE"]) ? (DateTime?)null : (DateTime?)row["FechaE"];
						retObj._diasEspera					 = Convert.IsDBNull(row["DiasEspera"]) ? (Int16?)null : (Int16?)row["DiasEspera"];
						retObj._interasado					 = Convert.IsDBNull(row["Interasado"]) ? null : (string)row["Interasado"];
						retObj._descripcion					 = Convert.IsDBNull(row["Descripcion"]) ? null : (string)row["Descripcion"];
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
			command.CommandText = InlineProcs.ctprReserva_SelectAllCount;
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
		///List-DAOReserva.
		///</returns>
		///<parameters>
		///DAOReserva daoReserva
		///</parameters>
		public static List<DAOReserva> SelectAllBySearchFields(DAOReserva daoReserva)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprReserva_SelectAllBySearchFields;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			DataTable dt = new DataTable("Reserva");
			SqlDataAdapter sqlAdapter = new SqlDataAdapter(command);
			try
			{
				command.Parameters.Add(new SqlParameter("@Id", SqlDbType.Int, 4, ParameterDirection.Input, false, 10, 0, "", DataRowVersion.Proposed, (object)daoReserva.Id?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@FechaR", SqlDbType.DateTime, 3, ParameterDirection.Input, false, 0, 0, "", DataRowVersion.Proposed, (object)daoReserva.FechaR?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@FechaE", SqlDbType.DateTime, 3, ParameterDirection.Input, false, 0, 0, "", DataRowVersion.Proposed, (object)daoReserva.FechaE?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@DiasEspera", SqlDbType.SmallInt, 2, ParameterDirection.Input, true, 5, 0, "", DataRowVersion.Proposed, (object)daoReserva.DiasEspera?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@Interasado", SqlDbType.VarChar, 4000, ParameterDirection.Input, false, 0, 0, "", DataRowVersion.Proposed, (object)daoReserva.Interasado?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@Descripcion", SqlDbType.VarChar, 4000, ParameterDirection.Input, false, 0, 0, "", DataRowVersion.Proposed, (object)daoReserva.Descripcion?? (object)DBNull.Value));

				staticConnection.Open();
				sqlAdapter.Fill(dt);


				List<DAOReserva> objList = new List<DAOReserva>();
				if(dt.Rows.Count > 0)
				{
					foreach(DataRow row in dt.Rows)
					{
						DAOReserva retObj = new DAOReserva();
						retObj._id					 = Convert.IsDBNull(row["Id"]) ? (Int32?)null : (Int32?)row["Id"];
						retObj._fechaR					 = Convert.IsDBNull(row["FechaR"]) ? (DateTime?)null : (DateTime?)row["FechaR"];
						retObj._fechaE					 = Convert.IsDBNull(row["FechaE"]) ? (DateTime?)null : (DateTime?)row["FechaE"];
						retObj._diasEspera					 = Convert.IsDBNull(row["DiasEspera"]) ? (Int16?)null : (Int16?)row["DiasEspera"];
						retObj._interasado					 = Convert.IsDBNull(row["Interasado"]) ? null : (string)row["Interasado"];
						retObj._descripcion					 = Convert.IsDBNull(row["Descripcion"]) ? null : (string)row["Descripcion"];
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
		///DAOReserva daoReserva
		///</parameters>
		public static Int32 SelectAllBySearchFieldsCount(DAOReserva daoReserva)
		{
			SqlCommand	command = new SqlCommand();
			command.CommandText = InlineProcs.ctprReserva_SelectAllBySearchFieldsCount;
			command.CommandType = CommandType.Text;
			SqlConnection staticConnection = StaticSqlConnection;
			command.Connection = staticConnection;

			try
			{
				command.Parameters.Add(new SqlParameter("@Id", SqlDbType.Int, 4, ParameterDirection.Input, false, 10, 0, "", DataRowVersion.Proposed, (object)daoReserva.Id?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@FechaR", SqlDbType.DateTime, 3, ParameterDirection.Input, false, 0, 0, "", DataRowVersion.Proposed, (object)daoReserva.FechaR?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@FechaE", SqlDbType.DateTime, 3, ParameterDirection.Input, false, 0, 0, "", DataRowVersion.Proposed, (object)daoReserva.FechaE?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@DiasEspera", SqlDbType.SmallInt, 2, ParameterDirection.Input, true, 5, 0, "", DataRowVersion.Proposed, (object)daoReserva.DiasEspera?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@Interasado", SqlDbType.VarChar, 4000, ParameterDirection.Input, false, 0, 0, "", DataRowVersion.Proposed, (object)daoReserva.Interasado?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@Descripcion", SqlDbType.VarChar, 4000, ParameterDirection.Input, false, 0, 0, "", DataRowVersion.Proposed, (object)daoReserva.Descripcion?? (object)DBNull.Value));

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
		///This method allows the object to update itself in the table Reserva based on its primary key(s)
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
			command.CommandText = InlineProcs.ctprReserva_UpdateOne;
			command.CommandType = CommandType.Text;
			command.Connection = _connectionProvider.Connection;
			command.Transaction = _connectionProvider.CurrentTransaction;

			try
			{
				command.Parameters.Add(new SqlParameter("@Id", SqlDbType.Int, 4, ParameterDirection.InputOutput, false, 10, 0, "", DataRowVersion.Proposed, (object)_id?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@FechaR", SqlDbType.DateTime, 3, ParameterDirection.InputOutput, false, 0, 0, "", DataRowVersion.Proposed, (object)_fechaR?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@FechaE", SqlDbType.DateTime, 3, ParameterDirection.InputOutput, false, 0, 0, "", DataRowVersion.Proposed, (object)_fechaE?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@DiasEspera", SqlDbType.SmallInt, 2, ParameterDirection.InputOutput, true, 5, 0, "", DataRowVersion.Proposed, (object)_diasEspera?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@Interasado", SqlDbType.VarChar, 4000, ParameterDirection.InputOutput, false, 0, 0, "", DataRowVersion.Proposed, (object)_interasado?? (object)DBNull.Value));
				command.Parameters.Add(new SqlParameter("@Descripcion", SqlDbType.VarChar, 4000, ParameterDirection.InputOutput, false, 0, 0, "", DataRowVersion.Proposed, (object)_descripcion?? (object)DBNull.Value));

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

		public Int32? Id
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

		public DateTime? FechaR
		{
			get
			{
				return _fechaR;
			}
			set
			{
				_fechaR = value;
			}
		}

		public DateTime? FechaE
		{
			get
			{
				return _fechaE;
			}
			set
			{
				_fechaE = value;
			}
		}

		public Int16? DiasEspera
		{
			get
			{
				return _diasEspera;
			}
			set
			{
				_diasEspera = value;
			}
		}

		public string Interasado
		{
			get
			{
				return _interasado;
			}
			set
			{
				_interasado = value;
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

		#endregion
	}
}

#region inline sql procs
namespace studio.DataObjects
{
	public partial class InlineProcs
	{
		internal static string ctprReserva_SelectOne = @"
			-- Select one row based on the primary key(s)
			-- selects all rows from the table
			SELECT 
			[Id]
			,[FechaR]
			,[FechaE]
			,[DiasEspera]
			,[Interasado]
			,[Descripcion]
			FROM [dbo].[Reserva]
			WHERE 
			[Id] = @Id
			";

		internal static string ctprReserva_DeleteOne = @"
			-- Delete a row based on the primary key(s)
			-- delete all matching from the table
			DELETE [dbo].[Reserva]
			WHERE 
			[Id] = @Id
			";

		internal static string ctprReserva_InsertOne = @"
			-- Insert a new row
			-- inserts a new row into the table
			INSERT [dbo].[Reserva]
			(
			[Id]
			,[FechaR]
			,[FechaE]
			,[DiasEspera]
			,[Interasado]
			,[Descripcion]
			)
			VALUES
			(
			@Id
			,@FechaR
			,@FechaE
			,@DiasEspera
			,@Interasado
			,@Descripcion
			)
			SELECT 
			@Id = [Id]
			,@FechaR = [FechaR]
			,@FechaE = [FechaE]
			,@DiasEspera = [DiasEspera]
			,@Interasado = [Interasado]
			,@Descripcion = [Descripcion]
			FROM [dbo].[Reserva]
			WHERE 
			[Id] = @Id
			";

		internal static string ctprReserva_SelectAll = @"
			-- Select All rows
			-- selects all rows from the table
			SELECT 
			[Id]
			,[FechaR]
			,[FechaE]
			,[DiasEspera]
			,[Interasado]
			,[Descripcion]
			FROM [dbo].[Reserva]
			";

		internal static string ctprReserva_SelectAllCount = @"
			
			-- selects count of all rows from the table
			SELECT COUNT(*)
			FROM [dbo].[Reserva]
			";

		internal static string ctprReserva_SelectAllBySearchFields = @"
			
			-- selects all rows from the table according to search criteria
			SELECT 
			[Id],
			[FechaR],
			[FechaE],
			[DiasEspera],
			[Interasado],
			[Descripcion]
			FROM [dbo].[Reserva]
			WHERE 
			([Id] LIKE @Id OR @Id is null)
			AND ([FechaR] LIKE @FechaR OR @FechaR is null)
			AND ([FechaE] LIKE @FechaE OR @FechaE is null)
			AND ([DiasEspera] LIKE @DiasEspera OR @DiasEspera is null)
			AND ([Interasado] LIKE @Interasado OR @Interasado is null)
			AND ([Descripcion] LIKE @Descripcion OR @Descripcion is null)
			";

		internal static string ctprReserva_SelectAllBySearchFieldsCount = @"
			-- Get count of rows returnable by this query
			-- selects count of all rows from the table according to search criteria
			SELECT COUNT(*)
			FROM [dbo].[Reserva]
			WHERE 
			([Id] LIKE @Id OR @Id is null)
			AND ([FechaR] LIKE @FechaR OR @FechaR is null)
			AND ([FechaE] LIKE @FechaE OR @FechaE is null)
			AND ([DiasEspera] LIKE @DiasEspera OR @DiasEspera is null)
			AND ([Interasado] LIKE @Interasado OR @Interasado is null)
			AND ([Descripcion] LIKE @Descripcion OR @Descripcion is null)
			";

		internal static string ctprReserva_UpdateOne = @"
			-- Update one row based on the primary key(s)
			-- updates a row in the table based on the primary key
			
			UPDATE [dbo].[Reserva]
			SET
			[FechaR] = @FechaR
			,[FechaE] = @FechaE
			,[DiasEspera] = @DiasEspera
			,[Interasado] = @Interasado
			,[Descripcion] = @Descripcion
			WHERE 
			[Id] = @Id
			SELECT 
			@Id = [Id]
			,@FechaR = [FechaR]
			,@FechaE = [FechaE]
			,@DiasEspera = [DiasEspera]
			,@Interasado = [Interasado]
			,@Descripcion = [Descripcion]
			FROM [dbo].[Reserva]
			WHERE 
			[Id] = @Id
			";
        internal static string PROC_INSERTAR_rReserva = @"
			-- Insert a new row
			-- inserts a new row into the table 
			EXEC INS_RESERVA 
			  
			@Id
			,@FechaR
			,@FechaE
			,@DiasEspera
			,@Interasado
			,@Descripcion
			
			
			";

	}
}
#endregion