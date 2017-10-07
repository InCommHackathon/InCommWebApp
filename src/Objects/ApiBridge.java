package Objects;

import io.swagger.client.ApiClient;
import io.swagger.client.api.AccountApi;
import io.swagger.client.api.TransactionApi;



public class ApiBridge {

    private ApiClient apiClient = new ApiClient();
    private AccountApi accountApi = new AccountApi();
    private TransactionApi transactionApi = new TransactionApi();

    public ApiBridge() {
        setup();
    }

    public void setup()
    {
        apiClient.setAccessToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6Ik9VVXhRVVF4UXpGQ1JrWTVSVUUwUWpORk0wVTJPRGt6UmpNME9VSTRORGRHTnpkR056YzFOUSJ9.eyJodHRwczovL2luY29tbS1hY3QtbWd0LmFwcHNwb3QuY29tL2p0aSI6Ijc4ZTBhYmZmLTU2MjktNGQ3NS05OGJlLTg4MGNkZjFlM2JhOSIsImlzcyI6Imh0dHBzOi8vamdlb3JnZS1pbmNvbW0uYXV0aDAuY29tLyIsInN1YiI6Imdvb2dsZS1vYXV0aDJ8MTA1MDYyMTY0NzYxMDU4OTkyNTM0IiwiYXVkIjpbImh0dHBzOi8vaW5jb21tLWFjdC1tZ3QuYXBwc3BvdC5jb20iLCJodHRwczovL2pnZW9yZ2UtaW5jb21tLmF1dGgwLmNvbS91c2VyaW5mbyJdLCJpYXQiOjE1MDczOTMyNTQsImV4cCI6MTUwNzQ3OTY1NCwiYXpwIjoidlRyRTRuc3FUNVFxWU1YYWxDdkpyWkhiRUJ0STlIWmYiLCJzY29wZSI6Im9wZW5pZCB3cml0ZTpkYXRhIGRlbGV0ZTp0cmFuc2FjdGlvbnMgd3JpdGU6dHJhbnNhY3Rpb25zIHJlYWQ6dHJhbnNhY3Rpb25zIHdyaXRlOmFjY291bnQgZGVsZXRlOmFjY291bnQgcmVhZDphY2NvdW50In0.TNvm8L6VXa0eig9ixiaJjuWo_dMAfSQpg6zRg-ul30CB1pIhnGBoTVwDJsD3nNJqX167e6kHU5CHX0Geivyt4_RdsGCedDPAn_euK7eyF2XwaZhX_zxN24qoa9HFlzrde7vKPprehcMXsCkc_myryKe8StY3qAQuL5QU26kh_Xg4ASClj8gf14HN1zvQt-fV5BcWl-QbFAQAQ2F25mtzevzEQ55uqNYbJU0hK4trxe03SbZ4Yvxhb9lCkRKW7jX21B9jdrEkXNlS94AUIWrz1GrJirt6id_qa35-eGD-1tHFojVwiRvk3L7W_D0sIDoOhb39X-39Lr7LWP9cx6sFew");
        accountApi.setApiClient(apiClient);
        transactionApi.setApiClient(apiClient);
    }

    public AccountApi getAccountApi() {
        return accountApi;
    }

    public TransactionApi getTransactionApi() {
        return transactionApi;
    }

    public static void main(String[] args) {
        ApiBridge apiBridge = new ApiBridge();
        apiBridge.setup();
    }
}
