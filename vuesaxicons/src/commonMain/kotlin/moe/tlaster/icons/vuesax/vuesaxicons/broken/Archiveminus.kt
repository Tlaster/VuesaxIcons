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

public val BrokenGroup.Archiveminus: ImageVector
    get() {
        if (_archiveminus != null) {
            return _archiveminus!!
        }
        _archiveminus = Builder(name = "Archiveminus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 10.6499f)
                horizontalLineTo(9.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.3203f, 10.01f)
                verticalLineTo(19.94f)
                curveTo(3.3203f, 21.74f, 4.6103f, 22.5f, 6.1903f, 21.63f)
                lineTo(11.0703f, 18.92f)
                curveTo(11.5903f, 18.63f, 12.4303f, 18.63f, 12.9403f, 18.92f)
                lineTo(17.8203f, 21.63f)
                curveTo(19.4003f, 22.51f, 20.6903f, 21.75f, 20.6903f, 19.94f)
                verticalLineTo(5.86f)
                curveTo(20.6903f, 3.74f, 18.9503f, 2.0f, 16.8303f, 2.0f)
                horizontalLineTo(7.1803f)
                curveTo(5.0503f, 2.0f, 3.3203f, 3.74f, 3.3203f, 5.86f)
            }
        }
        .build()
        return _archiveminus!!
    }

private var _archiveminus: ImageVector? = null
