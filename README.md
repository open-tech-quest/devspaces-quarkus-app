# Open Tech Quest — Hands-on Day 2026

Welcome to the **Open Tech Quest** challenge! You will work in **OpenShift Dev Spaces** to fix a critically broken REST endpoint.

---

## Step 1 — Get your workspace running

This repository is configured for **OpenShift Dev Spaces**. Import it by pasting the repository URL into the Dev Spaces dashboard.

Once your workspace is ready, the project opens automatically in VS Code. Check the terminal output for a message printed by the startup script.

---

## Step 2 — Start the application

Quarkus supports **live coding**: the app recompiles and reloads automatically whenever you save a file — no restart needed.

Run in the terminal:

```shell
./mvnw quarkus:dev
```

Or use the **"3. Run (Quarkus Dev Mode)"** command from the Dev Spaces command palette.

Once started, open the app in your browser using the preview link that Dev Spaces shows when port 8080 becomes available.

---

## Step 3 — Fix the endpoint

Open `src/main/java/com/redhat/DeployFridayResource.java`.

The endpoint currently returns `200 OK` with `"yes"`. Fix it so the HTTP status code is **418**. Use the `ENCODED_FLAG` constant already present in the class as the response body.

After saving, Quarkus reloads automatically. Refresh the browser — when the fix is correct the page will reveal the flag.

---

## Useful Links

- [Quarkus REST guide](https://quarkus.io/guides/getting-started)
- [JAX-RS Response API (Jakarta EE)](https://jakarta.ee/specifications/restful-ws/3.1/apidocs/jakarta/ws/rs/core/response)
- [HTTP 418 — the most important status code](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/418)
