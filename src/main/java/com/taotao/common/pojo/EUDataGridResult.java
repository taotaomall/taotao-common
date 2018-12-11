package com.taotao.common.pojo;

import java.util.List;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 21:00 2018/2/5
 */
public class EUDataGridResult {
        private long total;
        private List<?> rows;

        public long getTotal() {
                return total;
        }

        public void setTotal(long total) {
                this.total = total;
        }

        public List<?> getRows() {
                return rows;
        }

        public void setRows(List<?> rows) {
                this.rows = rows;
        }
}
