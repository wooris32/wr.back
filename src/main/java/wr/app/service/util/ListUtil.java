package wr.app.service.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public abstract class ListUtil {

    /**
     * Object List 에서 특정 Field의 중복을 제거한 후 Object List로 반환한다.
     *
     * @param list
     * @param key
     * @return
     * @param <T>
     *
     * Ex) ListUtil.removeDuplication(list, DoubleCouponPrdDetail::getPrdCd)
     */
    public static <T> List<T> removeDuplication(final List<T>list, Function<? super T,?> key){
        return list.stream()
                .filter(removeDuplication(key))
                .collect(Collectors.toList());
    }
    public static <T> Predicate<T> removeDuplication(Function<? super T, ?>key) {
        final Set<Object> set = ConcurrentHashMap.newKeySet();
        return predicate -> set.add(key.apply(predicate));
    }

    /**
     * Object List 에서 Member만 뽑아 Object List로 반환한다.
     *
     * @param inputList : 대상 List
     * @param fieldExtractor : 뽑을 Member
     * @return
     * @param <T>
     * @param <R>
     *
     * Ex) List<Long> prdCds = ListUtil.extractField(list, DoubleCouponPrdDetail::getPrdCd)
     */
    public static <T, R> List<R> extractField(List<T> inputList, Function<T, R> fieldExtractor) {
        return inputList.stream()
                .map(fieldExtractor)
                .collect(Collectors.toList());
    }

    public static <T> List<List<T>> partitionList(List<T> list, int n) {
        List<List<T>> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i += n) {
            int end = Math.min(i + n, list.size());
            result.add(new ArrayList<>(list.subList(i, end)));
        }
        return result;
    }
}

