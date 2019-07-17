package jobbleapi

@SuppressWarnings('GrailsDomainReservedSqlKeywordName')
class Transaction {

    String name
    Integer amount
    Type type

    static constraints = {
        name maxSize: 255
        amount maxSize: 11
    }
}
