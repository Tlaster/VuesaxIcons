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

public val BulkGroup.Youtube: ImageVector
    get() {
        if (_youtube != null) {
            return _youtube!!
        }
        _youtube = Builder(name = "Youtube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.58f, strokeAlpha
                    = 0.58f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
                moveTo(17.0f, 20.0f)
                horizontalLineTo(7.0f)
                curveTo(4.0f, 20.0f, 2.0f, 18.0f, 2.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(2.0f, 6.0f, 4.0f, 4.0f, 7.0f, 4.0f)
                horizontalLineTo(17.0f)
                curveTo(20.0f, 4.0f, 22.0f, 6.0f, 22.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 18.0f, 20.0f, 20.0f, 17.0f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.4196f, 9.4901f)
                lineTo(13.8896f, 10.9701f)
                curveTo(14.8296f, 11.5401f, 14.8296f, 12.4601f, 13.8896f, 13.0301f)
                lineTo(11.4196f, 14.5101f)
                curveTo(10.4196f, 15.1101f, 9.5996f, 14.6501f, 9.5996f, 13.4801f)
                verticalLineTo(10.5101f)
                curveTo(9.5996f, 9.3501f, 10.4196f, 8.8901f, 11.4196f, 9.4901f)
                close()
            }
        }
        .build()
        return _youtube!!
    }

private var _youtube: ImageVector? = null
