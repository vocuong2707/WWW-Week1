package vn.edu.iuh.fit.models;

public class GrantAccess {
    private Roles roles;
    private Account account;

    private Enum_isGrant is_grant;

    public GrantAccess() {
    }

    public GrantAccess(Roles roles, Account account, Enum_isGrant is_grant) {
        this.roles = roles;
        this.account = account;
        this.is_grant = is_grant;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Enum_isGrant getIs_grant() {
        return is_grant;
    }

    public void setIs_grant(Enum_isGrant is_grant) {
        this.is_grant = is_grant;
    }

    @Override
    public String toString() {
        return "GrantAccess{" +
                "roles=" + roles +
                ", account=" + account +
                ", is_grant=" + is_grant +
                '}';
    }
}
