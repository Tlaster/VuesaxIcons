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

public val BrokenGroup.Archiveadd: ImageVector
    get() {
        if (_archiveadd != null) {
            return _archiveadd!!
        }
        _archiveadd = Builder(name = "Archiveadd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 10.6499f)
                horizontalLineTo(9.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 8.21f)
                verticalLineTo(13.21f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.3203f, 10.04f)
                verticalLineTo(19.95f)
                curveTo(3.3203f, 21.75f, 4.6103f, 22.51f, 6.1903f, 21.64f)
                lineTo(11.0703f, 18.93f)
                curveTo(11.5903f, 18.64f, 12.4303f, 18.64f, 12.9403f, 18.93f)
                lineTo(17.8203f, 21.64f)
                curveTo(19.4003f, 22.52f, 20.6903f, 21.76f, 20.6903f, 19.95f)
                verticalLineTo(5.86f)
                curveTo(20.6903f, 3.74f, 18.9503f, 2.0f, 16.8303f, 2.0f)
                horizontalLineTo(7.1803f)
                curveTo(5.0503f, 2.0f, 3.3203f, 3.74f, 3.3203f, 5.86f)
            }
        }
        .build()
        return _archiveadd!!
    }

private var _archiveadd: ImageVector? = null
