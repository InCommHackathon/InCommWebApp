package Objects;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.AccountApi;
import io.swagger.client.api.TransactionApi;
import io.swagger.client.model.Account;
import io.swagger.client.model.Transaction;

public class Main {

    public static void main(String[] args) throws ApiException {
        AccountApi accountApi = new AccountApi();
        ApiClient apiClient = new ApiClient();
        apiClient.setAccessToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6Ik9VVXhRVVF4UXpGQ1JrWTVSVUUwUWpORk0wVTJPRGt6UmpNME9VSTRORGRHTnpkR056YzFOUSJ9.eyJodHRwczovL2luY29tbS1hY3QtbWd0LmFwcHNwb3QuY29tL2p0aSI6IjU1MjVlZmUwLWE5ODEtNGY0Yi04MjZmLTQ5YzQyMjg2ZWE4YiIsImlzcyI6Imh0dHBzOi8vamdlb3JnZS1pbmNvbW0uYXV0aDAuY29tLyIsInN1YiI6Imdvb2dsZS1vYXV0aDJ8MTA1MDYyMTY0NzYxMDU4OTkyNTM0IiwiYXVkIjpbImh0dHBzOi8vaW5jb21tLWFjdC1tZ3QuYXBwc3BvdC5jb20iLCJodHRwczovL2pnZW9yZ2UtaW5jb21tLmF1dGgwLmNvbS91c2VyaW5mbyJdLCJpYXQiOjE1MDczMDY1NDcsImV4cCI6MTUwNzM5Mjk0NywiYXpwIjoidlRyRTRuc3FUNVFxWU1YYWxDdkpyWkhiRUJ0STlIWmYiLCJzY29wZSI6Im9wZW5pZCB3cml0ZTpkYXRhIGRlbGV0ZTp0cmFuc2FjdGlvbnMgd3JpdGU6dHJhbnNhY3Rpb25zIHJlYWQ6dHJhbnNhY3Rpb25zIHdyaXRlOmFjY291bnQgZGVsZXRlOmFjY291bnQgcmVhZDphY2NvdW50In0.fTqU_TMVa6RohjKeuuZaRxS3LyNu366stNSDs7t3ZN9Iw4C6enVuBpFqQYQWMhGxeOxlZf8wzwwHExEmgS6x1DXGQ1Q2OtNQMCgEeJO9A0Gf3x26UisOgeBrhdaWyRvBGOQemJ0VDovahOndYQYk1wGWMnhM5_e86dyqctX1X0TlW1EH5ofOAU-pDDIwI-voke-tdqwrOZy6D3xLOWNquoAi9ligepE_QqoQKfbzHmx3Ub3RyMy6HSW2R5F9q2qQYSfDddPOTEvtvkxjTCugDedu8jVe-Fneo4KKnKnEK_26DlGJyuK2gxcLlf0WE98MRpMZVePr5bV7nu2sfTUSNg");
        accountApi.setApiClient(apiClient);
        Account account = accountApi.accountGet();
        Account account1 = account.balance(1500L);
        System.out.println(account.getId());
        System.out.println(account.getBalance());
        TransactionApi transactionApi = new TransactionApi();
        transactionApi.setApiClient(apiClient);
        Transaction transaction = new Transaction();
        transaction.amount(1500L);
        transaction.setDescription("test");
        transaction.setType(Transaction.TypeEnum.CREDIT);
        transaction.setAmount(1500L);
        //transactionApi.transactionCreate(transaction);
        System.out.println(account.getBalance());

    }
}
