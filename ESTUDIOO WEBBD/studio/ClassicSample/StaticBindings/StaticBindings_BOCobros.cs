/*************************************************************
** Class generated by CodeTrigger, Version 4.3.0.6
** CodeTrigger is an Exotechnic Corporation (UK) Ltd Product 
** This class was generated on 08/06/2014 17:05:12
** Changes to this file may cause incorrect behaviour and will be lost if the code is regenerated
**************************************************************/
using System;
using System.Collections.Generic;
using studio.BusinessObjects;

namespace studio.ClassicSample.StaticBindings
{
	public partial class StaticBindings
	{
		public static List<BOCobros> GetCobrosList()
		{
			try
			{
				List<BOCobros> listCobros = BOCobros.CobrosCollection();
				return listCobros;
			}
			catch(Exception)
			{	/*rethrow or handle gracefully*/return new List<BOCobros>();	}
			finally	{	}
		}
	}
}

