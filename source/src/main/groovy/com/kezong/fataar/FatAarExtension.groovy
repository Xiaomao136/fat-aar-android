package com.kezong.fataar;

class FatAarExtension {

    static final String NAME = "fataar"

    /**
     * Plan A: using bytecode patching to process the merging problem of R files
     * Plan B: generate sub module's R class to process the merging problem of R files
     * if transformR is true, use Plan A, else use Plan B.
     * In the future, Plan B maybe deprecated
     */
    boolean transformR = true

    /**
     * If transitive is true, local jar module and remote library's dependencies will be embed. (local aar module does not support)
     * If transitive is false, just embed first level dependency
     * Default value is false
     */
    boolean transitive = false
}
