import com.google.common.collect.Table;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.*;

public class Tachograph implements Table<Date, Float, Float> {

    private List<Date> currentTime = new ArrayList<Date>();
    private List<Float> joystickPos = new ArrayList<Float>();
    private List<Float> refSpeed = new ArrayList<Float>();

    int n = 0;

    @Override
    public @Nullable Float put(Date rowKey, Float columnKey, Float value) {
        currentTime.add(rowKey);
        joystickPos.add(columnKey);
        refSpeed.add(value);
        n++;
        return null;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean contains(@Nullable Object rowKey, @Nullable Object columnKey) {
        return false;
    }

    @Override
    public boolean containsRow(@Nullable Object rowKey) {
        return false;
    }

    @Override
    public boolean containsColumn(@Nullable Object columnKey) {
        return false;
    }

    @Override
    public boolean containsValue(@Nullable Object value) {
        return false;
    }

    @Override
    public @Nullable Float get(@Nullable Object rowKey, @Nullable Object columnKey) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public void putAll(Table<? extends Date, ? extends Float, ? extends Float> table) {

    }

    @Override
    public @Nullable Float remove(@Nullable Object rowKey, @Nullable Object columnKey) {
        return null;
    }

    @Override
    public Map<Float, Float> row(Date rowKey) {
        return null;
    }

    @Override
    public Map<Date, Float> column(Float columnKey) {
        return null;
    }

    @Override
    public Set<Cell<Date, Float, Float>> cellSet() {
        return null;
    }

    @Override
    public Set<Date> rowKeySet() {
        return null;
    }

    @Override
    public Set<Float> columnKeySet() {
        return null;
    }

    @Override
    public Collection<Float> values() {
        return null;
    }

    @Override
    public Map<Date, Map<Float, Float>> rowMap() {
        return null;
    }

    @Override
    public Map<Float, Map<Date, Float>> columnMap() {
        return null;
    }
}
