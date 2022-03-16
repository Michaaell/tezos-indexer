//package org.rarible.tezos.client.tzkt.utils
//
//enum PrimType : Byte {
//    parameter,
//    storage,
//    code,
//    False,
//    Elt,
//    Left,
//    None,
//    Pair,
//    Right,
//    Some,
//    True,
//    Unit,
//    PACK,
//    UNPACK,
//    BLAKE2B,
//    SHA256,
//    SHA512,
//    ABS,
//    ADD,
//    AMOUNT,
//    AND,
//    BALANCE,
//    CAR,
//    CDR,
//    CHECK_SIGNATURE,
//    COMPARE,
//    CONCAT,
//    CONS,
//    CREATE_ACCOUNT,
//    CREATE_CONTRACT,
//    IMPLICIT_ACCOUNT,
//    DIP,
//    DROP,
//    DUP,
//    EDIV,
//    EMPTY_MAP,
//    EMPTY_SET,
//    EQ,
//    EXEC,
//    FAILWITH,
//    GE,
//    GET,
//    GT,
//    HASH_KEY,
//    IF,
//    IF_CONS,
//    IF_LEFT,
//    IF_NONE,
//    INT,
//    LAMBDA,
//    LE,
//    LEFT,
//    LOOP,
//    LSL,
//    LSR,
//    LT,
//    MAP,
//    MEM,
//    MUL,
//    NEG,
//    NEQ,
//    NIL,
//    NONE,
//    NOT,
//    NOW,
//    OR,
//    PAIR,
//    PUSH,
//    RIGHT,
//    SIZE,
//    SOME,
//    SOURCE,
//    SENDER,
//    SELF,
//    STEPS_TO_QUOTA,
//    SUB,
//    SWAP,
//    TRANSFER_TOKENS,
//    SET_DELEGATE,
//    UNIT,
//    UPDATE,
//    XOR,
//    ITER,
//    LOOP_LEFT,
//    ADDRESS,
//    CONTRACT,
//    ISNAT,
//    CAST,
//    RENAME,
//    @bool,
//    contract,
//    @int,
//    key,
//    key_hash,
//    lambda,
//    list,
//    map,
//    big_map,
//    nat,
//    option,
//    or,
//    pair,
//    set,
//    signature,
//    @string,
//    bytes,
//    mutez,
//    timestamp,
//    unit,
//    operation,
//    address,
//    SLICE,
//    DIG,
//    DUG,
//    EMPTY_BIG_MAP,
//    APPLY,
//    chain_id,
//    CHAIN_ID,
//    LEVEL,
//    SELF_ADDRESS,
//    never,
//    NEVER,
//    UNPAIR,
//    VOTING_POWER,
//    TOTAL_VOTING_POWER,
//    KECCAK,
//    SHA3,
//    PAIRING_CHECK,
//    bls12_381_g1,
//    bls12_381_g2,
//    bls12_381_fr,
//    sapling_state,
//    sapling_transaction,
//    SAPLING_EMPTY_STATE,
//    SAPLING_VERIFY_UPDATE,
//    ticket,
//    TICKET,
//    READ_TICKET,
//    SPLIT_TICKET,
//    JOIN_TICKETS,
//    GET_AND_UPDATE,
//    chest,
//    chest_key,
//    OPEN_CHEST,
//    VIEW,
//    view,
//    constant
//}
//
//enum MichelineType : Byte
//{
//    Int     = 0b_0000_0000,
//    Bytes   = 0b_0010_0000,
//    String  = 0b_0100_0000,
//    Array   = 0b_0110_0000,
//    Prim    = 0b_1000_0000
//}
//
//enum AnnotationType : byte
//{
//    Unsafe   = 0b_0000_0000,
//    Field    = 0b_0100_0000,
//    Type     = 0b_1000_0000,
//    Variable = 0b_1100_0000
//}
//
//data class Micheline(type: MichelineType)
//data class Annotation(val type: AnnotationType, value: String)
//data class MichelinePrim(val type: MichelineType = MichelineType.Prim, val prim: PrimType, val args: Micheline? = null, annots: Annotation? = null): Micheline