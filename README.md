# Spring-Lifecycle
Show all step from init bean definition up to creation spring bean

1. Register configuration files to create BeanDefinition map (SomeConfig, SomeConfigSecond). Also checking @Conditional (TestConfigCondition, TestConfigConditionSecond) if present.
2. Registration BeanDefinitionRegistryPostProcessor and create BeanDefinition   
3. Call custom class MyBeanFactoryPostProcessor that implement BeanFactoryPostProcessor to additionally customise BeanDefinition.
(it is use for example in PropertySourcesPlaceholderConfigurer )
4. Registrate CustomFactoryBean that implements FactoryBean<MyBean> to customise creation MyBean
5. When Spring create bean it select BeanFactory or FactoryBean if instanse is present.
6. BeanPostProcessor class - we have ability to add additional code before and after init. (postProcessBeforeInitialization/postProcessAfterInitialization)
