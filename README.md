# an example of auth2 google login

Based on Spring security 6.1 and Spring boot.
Set your the Google id and secret in application.properties.


## get your client_id and client_secret from google console
Visit the Google Cloud Console at https://console.cloud.google.com.
- Set up the OAuth 2 consent screen if you haven't done so already.
- Go to the Credentials section and create a new OAuth 2 client ID.
- Select "Web application" as the type, and enter a name for the application.
- Add an authorized redirect URI: http://localhost:8080/login/oauth2/code/google.
- Click "Create" to obtain your client_id and client_secret for your properties file.