# kcm-demo

Run Keycloak instance

```shell
docker run -p 8080:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:21.1.1 start-dev
```

Run Quarkus app

```shell
quarkus dev
```

Check API

```shell
curl localhost:8081/api/admin/realm
```
