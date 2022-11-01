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

public val BulkGroup.Thorchain: ImageVector
    get() {
        if (_thorchain != null) {
            return _thorchain!!
        }
        _thorchain = Builder(name = "Thorchain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.3804f, 17.5702f)
                lineTo(6.0803f, 21.9102f)
                curveTo(5.0104f, 22.3602f, 4.0803f, 21.0302f, 4.8703f, 20.1802f)
                lineTo(12.6804f, 11.7002f)
                lineTo(16.7304f, 15.8202f)
                curveTo(17.2704f, 16.3602f, 17.0904f, 17.2802f, 16.3804f, 17.5702f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.17f, 3.7702f)
                lineTo(12.68f, 11.7002f)
                lineTo(8.63f, 7.6002f)
                curveTo(8.09f, 7.0502f, 8.27f, 6.1302f, 8.98f, 5.8402f)
                lineTo(17.92f, 2.0902f)
                curveTo(18.96f, 1.6502f, 19.89f, 2.9002f, 19.17f, 3.7702f)
                close()
            }
        }
        .build()
        return _thorchain!!
    }

private var _thorchain: ImageVector? = null
