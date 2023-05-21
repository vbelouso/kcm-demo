package org.acme.keycloak.admin.client;

import org.keycloak.admin.client.Keycloak;
import org.keycloak.representations.idm.RealmRepresentation;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/api/admin")
public class InitKeycloak {

    @Inject
    Keycloak keycloak;

    @POST
    @Path("/realm")
    public void createRealm() {
        RealmRepresentation realm = new RealmRepresentation();
        realm.setRealm("demo");
        realm.setEnabled(true);
        realm.setDisplayName("Demo realm display name");

        keycloak.realms().create(realm);
    }
}