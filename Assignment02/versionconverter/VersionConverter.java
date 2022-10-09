package corejava.collection.assignmentset3.Assignment02.versionconverter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class VersionConverter implements Comparator<String> {
@Override
public int compare(String version, String otherVersion) {
    return normalizedVersion(version).compareTo(normalizedVersion(otherVersion));
}
    private String normalizedVersion(String version) {
        return Arrays.stream(version.split("\\."))
                .map(v -> String.format("%2s", v).replace(' ', '0'))
                .collect(Collectors.joining("."));
    }
}
