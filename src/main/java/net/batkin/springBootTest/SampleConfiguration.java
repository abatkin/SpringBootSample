package net.batkin.springBootTest;

import org.springframework.boot.actuate.autoconfigure.*;
import org.springframework.boot.autoconfigure.PropertyPlaceholderAutoConfiguration;
import org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration;
import org.springframework.boot.autoconfigure.dao.PersistenceExceptionTranslationAutoConfiguration;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration;
import org.springframework.boot.autoconfigure.web.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan
@Import({
        ConfigurationPropertiesAutoConfiguration.class,
        DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        DispatcherServletAutoConfiguration.class,
        EmbeddedServletContainerAutoConfiguration.class,
        ErrorMvcAutoConfiguration.class,
        HttpEncodingAutoConfiguration.class,
        HttpMessageConvertersAutoConfiguration.class,
        JacksonAutoConfiguration.class,
        JmxAutoConfiguration.class,
        MultipartAutoConfiguration.class,
        PersistenceExceptionTranslationAutoConfiguration.class,
        PropertyPlaceholderAutoConfiguration.class,
        ServerPropertiesAutoConfiguration.class,
        TransactionAutoConfiguration.class,
        WebMvcAutoConfiguration.class,

        AuditAutoConfiguration.class,
        EndpointAutoConfiguration.class,
        EndpointMBeanExportAutoConfiguration.class,
        EndpointWebMvcAutoConfiguration.class,
        HealthIndicatorAutoConfiguration.class,
        ManagementServerPropertiesAutoConfiguration.class,
        ManagementWebSecurityAutoConfiguration.class,
        MetricFilterAutoConfiguration.class,
        MetricRepositoryAutoConfiguration.class,
        PublicMetricsAutoConfiguration.class,
})
@EnableTransactionManagement
public class SampleConfiguration {

}
