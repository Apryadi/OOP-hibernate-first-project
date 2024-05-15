package org.example;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ {

	public static volatile SingularAttribute<User, String> major;
	public static volatile SingularAttribute<User, String> name;
	public static volatile SingularAttribute<User, Integer> id;
	public static volatile SingularAttribute<User, Integer> age;

	public static final String MAJOR = "IMT";
	public static final String NAME = "Lisa";
	public static final String ID = "1";
	public static final String AGE = "20";

}

