package br.com.database.project.persistence;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import br.com.database.project.persistence.dao.NurseDao;

@SuppressWarnings("deprecation")
public class DaoFactory
{

	private static DaoFactory instance = null;

	public static DaoFactory getInstance()
	{
		if (instance == null)
			instance = new DaoFactory();
		return instance;
	}

	private DaoFactory()
	{
		super();
	}

	private BeanFactory factory;
	// private static RedeLinearDao REDELINEAR_DAO = null;
	private static NurseDao NURSE_DAO = null;

	public BeanFactory getFactory()
	{
		if (factory == null)
		{
			Resource configuration = new ClassPathResource("applicationContext.xml");
			factory = new XmlBeanFactory(configuration);
		}
		return factory;
	}

	// public RedeLinearDao getRedeLinearDao() {
	// if (REDELINEAR_DAO == null)
	// REDELINEAR_DAO = (RedeLinearDao) getFactory().getBean("RedeLinearDao");
	// return REDELINEAR_DAO;
	// }

	public NurseDao getNurseDao()
	{
		if (NURSE_DAO == null)
			NURSE_DAO = (NurseDao) getFactory().getBean("NurseDao");
		return NURSE_DAO;
	}
}