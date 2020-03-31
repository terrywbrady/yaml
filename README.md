# Sample Yaml Java Code

## Build
`mvn install`

## Run
`java -jar target/YamlParser-1.0.jar [yaml file]`

## Note
`test.yml` has a sample file with an anchor and reference example.

No dashes in environment variable names!

## AWS EC2 Setup
```
sudo yum install java-1.8.0-openjdk
sudo yum install maven
sudo yum install git
``` 

## Sample Execution
```
aws ssm put-parameter --name /demo/service1/dev/minio-accessKey --value "hello-access-key" --type String
export minio_endpoint="MY-ENDPOINT"
java -jar target/YamlParser-1.0.jar config.yml 
```

### Sample Output
```
...
         "service-properties": {
            "serviceType": "minio",
            "endPoint": "MY-ENDPOINT",
            "accessKey": "hello-access-key",
            "secretKey": "*SSM-minio-secretKey*"
          },

...
```