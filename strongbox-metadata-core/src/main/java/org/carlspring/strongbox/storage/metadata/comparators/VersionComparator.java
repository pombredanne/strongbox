package org.carlspring.strongbox.storage.metadata.comparators;

import org.apache.maven.artifact.versioning.ComparableVersion;

import java.util.Comparator;

/**
 * @author carlspring
 */
public class VersionComparator
        implements Comparator<String>
{

    public int compare(String v1, String v2)
    {
        if (v1 == null || v2 == null)
        {
            throw new IllegalArgumentException();
        }

        ComparableVersion av1 = new ComparableVersion(v1);
        ComparableVersion av2 = new ComparableVersion(v2);

        return av1.compareTo(av2);
    }

}