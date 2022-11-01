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

public val BulkGroup.`Frame-4`: ImageVector
    get() {
        if (`_frame-4` != null) {
            return `_frame-4`!!
        }
        `_frame-4` = Builder(name = "Frame-4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                lineTo(17.0f, 3.0f)
                lineTo(22.0f, 6.0f)
                verticalLineTo(18.0f)
                lineTo(17.0f, 21.0f)
                lineTo(7.0f, 15.0f)
                verticalLineTo(9.0f)
                lineTo(17.0f, 15.0f)
                verticalLineTo(9.0f)
                lineTo(12.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                lineTo(7.0f, 21.0f)
                lineTo(2.0f, 18.0f)
                verticalLineTo(6.0f)
                lineTo(7.0f, 3.0f)
                lineTo(17.0f, 9.0f)
                verticalLineTo(15.0f)
                lineTo(7.0f, 9.0f)
                verticalLineTo(15.0f)
                lineTo(12.0f, 18.0f)
                close()
            }
        }
        .build()
        return `_frame-4`!!
    }

private var `_frame-4`: ImageVector? = null
