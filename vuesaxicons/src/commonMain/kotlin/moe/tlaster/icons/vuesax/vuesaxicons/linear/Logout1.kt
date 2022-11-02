package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Logout1: ImageVector
    get() {
        if (_logout1 != null) {
            return _logout1!!
        }
        _logout1 = Builder(name = "Logout1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.9f, 7.56f)
                curveTo(9.21f, 3.96f, 11.06f, 2.49f, 15.11f, 2.49f)
                horizontalLineTo(15.24f)
                curveTo(19.71f, 2.49f, 21.5f, 4.28f, 21.5f, 8.75f)
                verticalLineTo(15.27f)
                curveTo(21.5f, 19.74f, 19.71f, 21.53f, 15.24f, 21.53f)
                horizontalLineTo(15.11f)
                curveTo(11.09f, 21.53f, 9.24f, 20.08f, 8.91f, 16.54f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 12.0f)
                horizontalLineTo(3.62f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.85f, 8.6499f)
                lineTo(2.5f, 11.9999f)
                lineTo(5.85f, 15.3499f)
            }
        }
        .build()
        return _logout1!!
    }

private var _logout1: ImageVector? = null
