package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Path2: ImageVector
    get() {
        if (_path2 != null) {
            return _path2!!
        }
        _path2 = Builder(name = "Path2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.8701f, 22.0001f)
                horizontalLineTo(14.1601f)
                curveTo(15.7801f, 22.0001f, 16.8501f, 20.8401f, 16.5301f, 19.4301f)
                lineTo(15.8401f, 16.3501f)
                horizontalLineTo(8.2001f)
                lineTo(7.5101f, 19.4301f)
                curveTo(7.2001f, 20.7601f, 8.3401f, 22.0001f, 9.8701f, 22.0001f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.7692f, 13.7401f)
                curveTo(20.4092f, 12.2801f, 20.4792f, 11.2601f, 19.1792f, 9.6101f)
                lineTo(13.9892f, 3.0301f)
                curveTo(12.8992f, 1.6501f, 11.1192f, 1.6501f, 10.0192f, 3.0301f)
                lineTo(4.8392f, 9.6101f)
                curveTo(3.5392f, 11.2601f, 3.5392f, 12.3301f, 5.2492f, 13.7401f)
                lineTo(8.1892f, 16.3501f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0098f, 2.6699f)
                verticalLineTo(6.9699f)
            }
        }
        .build()
        return _path2!!
    }

private var _path2: ImageVector? = null
