# transactions

Transactions is a grails application for demonstration purposes. It does a series of monetary transactions based on their states.

## Installation

Configuring grails app to use mysql in your build.gradle add these lines
```bash
   compile group: 'mysql', name: 'mysql-connector-java', version: '8.0.16'
   runtime 'mysql:mysql-connector-java:5.1.40'
```
Configure with your Mysql settings in application.yml
```bash
dataSource:
    pooled: true
    jmxExport: true
    driverClassName: com.mysql.cj.jdbc.Driver
    dialect: org.hibernate.dialect.MySQL5InnoDBDialect
    username: root
    password: 'your mysql root password'
```

```bash
environments:
    development:
        dataSource:
            dbCreate: update
            url: jdbc:mysql://localhost:3306/grails?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
```

## Usage
cd into project repo (assuming your development environment is setup to use grails)
```bash
grails run-app
```

## Endpoints

navigate directly to endpoints in browswer to see view or use the below curl command to get a json object of results

```bash
curl -i -H "Accept: application/json" "http://localhost:8080/endpoint"
```
/transaction

/transaction/create

/transaction/index

/transaction/show/id

/transaction/edit/id

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)
