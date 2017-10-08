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
        apiClient.setAccessToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6Ik9VVXhRVVF4UXpGQ1JrWTVSVUUwUWpORk0wVTJPRGt6UmpNME9VSTRORGRHTnpkR056YzFOUSJ9.eyJodHRwczovL2luY29tbS1hY3QtbWd0LmFwcHNwb3QuY29tL2p0aSI6ImIwMjllNWE0LTk1MWEtNDEwNC05YjU4LTdiMDM5MzA4MzljMSIsImlzcyI6Imh0dHBzOi8vamdlb3JnZS1pbmNvbW0uYXV0aDAuY29tLyIsInN1YiI6Imdvb2dsZS1vYXV0aDJ8MTA1MDYyMTY0NzYxMDU4OTkyNTM0IiwiYXVkIjpbImh0dHBzOi8vaW5jb21tLWFjdC1tZ3QuYXBwc3BvdC5jb20iLCJodHRwczovL2pnZW9yZ2UtaW5jb21tLmF1dGgwLmNvbS91c2VyaW5mbyJdLCJpYXQiOjE1MDc0NjcxNjMsImV4cCI6MTUwNzU1MzU2MywiYXpwIjoidlRyRTRuc3FUNVFxWU1YYWxDdkpyWkhiRUJ0STlIWmYiLCJzY29wZSI6Im9wZW5pZCB3cml0ZTpkYXRhIGRlbGV0ZTp0cmFuc2FjdGlvbnMgd3JpdGU6dHJhbnNhY3Rpb25zIHJlYWQ6dHJhbnNhY3Rpb25zIHdyaXRlOmFjY291bnQgZGVsZXRlOmFjY291bnQgcmVhZDphY2NvdW50In0.TZMD1kZL9SEZ2tWL6xOcnbGT5HEW2J28d95xQ4V-QkMBCi8KwNyuMPuhVfaBEGHfT0htEBWZn3VUja5uNScPXsOvoRIcK6jPPm5hopm72Jih91btq_Nhliy__pbiCkQXoTxXuW30_rOgopRNrRLkhGMzUgxm0yCCCy-5JD-MFQvFDQvndTFxXokBXPofFnAXypeQ4zeFKM3oOXWppealGMgl7P1UvwuQ3fErVsJYPh-E-Gwq6iPuaKTIkWc4mw_RNc8QNhhqwVm0ujBNNFaJrkhJmz3CvMVCfjTSNQhQt4x_Ms6IEVFP7swnRzS_2eNBz3dE7OpLLfeDLk8GnGvbDg");
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
