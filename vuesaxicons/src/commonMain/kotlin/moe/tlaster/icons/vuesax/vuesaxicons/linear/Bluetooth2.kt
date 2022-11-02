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

public val LinearGroup.Bluetooth2: ImageVector
    get() {
        if (_bluetooth2 != null) {
            return _bluetooth2!!
        }
        _bluetooth2 = Builder(name = "Bluetooth2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.64f, 18.64f)
                lineTo(16.99f, 7.32f)
                curveTo(17.5f, 6.85f, 17.49f, 6.1f, 16.95f, 5.65f)
                lineTo(13.1f, 2.44f)
                curveTo(12.1f, 1.61f, 11.28f, 1.99f, 11.28f, 3.29f)
                verticalLineTo(20.71f)
                curveTo(11.28f, 22.01f, 12.1f, 22.39f, 13.1f, 21.56f)
                lineTo(16.95f, 18.35f)
                curveTo(17.49f, 17.9f, 17.5f, 17.15f, 16.99f, 16.68f)
                lineTo(4.64f, 5.36f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 13.0f)
                curveTo(5.5523f, 13.0f, 6.0f, 12.5523f, 6.0f, 12.0f)
                curveTo(6.0f, 11.4477f, 5.5523f, 11.0f, 5.0f, 11.0f)
                curveTo(4.4477f, 11.0f, 4.0f, 11.4477f, 4.0f, 12.0f)
                curveTo(4.0f, 12.5523f, 4.4477f, 13.0f, 5.0f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 13.0f)
                curveTo(19.5523f, 13.0f, 20.0f, 12.5523f, 20.0f, 12.0f)
                curveTo(20.0f, 11.4477f, 19.5523f, 11.0f, 19.0f, 11.0f)
                curveTo(18.4477f, 11.0f, 18.0f, 11.4477f, 18.0f, 12.0f)
                curveTo(18.0f, 12.5523f, 18.4477f, 13.0f, 19.0f, 13.0f)
                close()
            }
        }
        .build()
        return _bluetooth2!!
    }

private var _bluetooth2: ImageVector? = null
