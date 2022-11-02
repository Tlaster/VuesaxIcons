package moe.tlaster.icons.vuesax.vuesaxicons.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Transactionminus: ImageVector
    get() {
        if (_transactionminus != null) {
            return _transactionminus!!
        }
        _transactionminus = Builder(name = "Transactionminus", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.7302f, 19.7f)
                curveTo(7.5502f, 18.82f, 8.8002f, 18.89f, 9.5202f, 19.85f)
                lineTo(10.5302f, 21.2f)
                curveTo(11.3402f, 22.27f, 12.6502f, 22.27f, 13.4602f, 21.2f)
                lineTo(14.4702f, 19.85f)
                curveTo(15.1902f, 18.89f, 16.4402f, 18.82f, 17.2602f, 19.7f)
                curveTo(19.0402f, 21.6f, 20.4902f, 20.97f, 20.4902f, 18.31f)
                verticalLineTo(7.04f)
                curveTo(20.4902f, 3.01f, 19.5502f, 2.0f, 15.7702f, 2.0f)
                horizontalLineTo(8.2102f)
                curveTo(4.4302f, 2.0f, 3.4902f, 3.01f, 3.4902f, 7.04f)
                verticalLineTo(18.3f)
                curveTo(3.5002f, 20.97f, 4.9602f, 21.59f, 6.7302f, 19.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.75f, 10.75f)
                horizontalLineTo(9.25f)
                curveTo(8.84f, 10.75f, 8.5f, 10.41f, 8.5f, 10.0f)
                curveTo(8.5f, 9.59f, 8.84f, 9.25f, 9.25f, 9.25f)
                horizontalLineTo(14.75f)
                curveTo(15.16f, 9.25f, 15.5f, 9.59f, 15.5f, 10.0f)
                curveTo(15.5f, 10.41f, 15.16f, 10.75f, 14.75f, 10.75f)
                close()
            }
        }
        .build()
        return _transactionminus!!
    }

private var _transactionminus: ImageVector? = null
