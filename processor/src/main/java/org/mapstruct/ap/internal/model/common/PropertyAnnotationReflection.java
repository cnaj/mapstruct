/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.internal.model.common;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

import org.mapstruct.ap.internal.util.accessor.AccessorType;

public class PropertyAnnotationReflection extends ModelElement {

    private final Type containingType;
    private final String accessorSimpleName;
    private final boolean isMethod;

    public PropertyAnnotationReflection(Type containingType, String accessorSimpleName, AccessorType accessorType) {
        if ( !EnumSet.of( AccessorType.FIELD, AccessorType.GETTER ).contains( accessorType ) ) {
            throw new IllegalArgumentException( "Reading accessor type required, given: " + accessorType );
        }
        this.containingType = containingType;
        this.accessorSimpleName = accessorSimpleName;
        this.isMethod = ( accessorType == AccessorType.GETTER );
    }

    @Override
    public Set<Type> getImportTypes() {
        return Collections.singleton( containingType );
    }

    public Type getContainingType() {
        return containingType;
    }

    public String getAccessorSimpleName() {
        return accessorSimpleName;
    }

    public boolean isMethod() {
        return isMethod;
    }

}
