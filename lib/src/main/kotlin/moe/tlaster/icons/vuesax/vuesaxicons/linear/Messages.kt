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

public val LinearGroup.Messages: ImageVector
    get() {
        if (_messages != null) {
            return _messages!!
        }
        _messages = Builder(name = "Messages", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.98f, 10.79f)
                verticalLineTo(14.79f)
                curveTo(17.98f, 15.05f, 17.97f, 15.3f, 17.94f, 15.54f)
                curveTo(17.71f, 18.24f, 16.12f, 19.58f, 13.19f, 19.58f)
                horizontalLineTo(12.79f)
                curveTo(12.54f, 19.58f, 12.3f, 19.7f, 12.15f, 19.9f)
                lineTo(10.95f, 21.5f)
                curveTo(10.42f, 22.21f, 9.56f, 22.21f, 9.03f, 21.5f)
                lineTo(7.83f, 19.9f)
                curveTo(7.7f, 19.73f, 7.41f, 19.58f, 7.19f, 19.58f)
                horizontalLineTo(6.79f)
                curveTo(3.6f, 19.58f, 2.0f, 18.79f, 2.0f, 14.79f)
                verticalLineTo(10.79f)
                curveTo(2.0f, 7.86f, 3.35f, 6.27f, 6.04f, 6.04f)
                curveTo(6.28f, 6.01f, 6.53f, 6.0f, 6.79f, 6.0f)
                horizontalLineTo(13.19f)
                curveTo(16.38f, 6.0f, 17.98f, 7.6f, 17.98f, 10.79f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.98f, 6.79f)
                verticalLineTo(10.79f)
                curveTo(21.98f, 13.73f, 20.63f, 15.31f, 17.94f, 15.54f)
                curveTo(17.97f, 15.3f, 17.98f, 15.05f, 17.98f, 14.79f)
                verticalLineTo(10.79f)
                curveTo(17.98f, 7.6f, 16.38f, 6.0f, 13.19f, 6.0f)
                horizontalLineTo(6.79f)
                curveTo(6.53f, 6.0f, 6.28f, 6.01f, 6.04f, 6.04f)
                curveTo(6.27f, 3.35f, 7.86f, 2.0f, 10.79f, 2.0f)
                horizontalLineTo(17.19f)
                curveTo(20.38f, 2.0f, 21.98f, 3.6f, 21.98f, 6.79f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.4955f, 13.25f)
                horizontalLineTo(13.5045f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.9955f, 13.25f)
                horizontalLineTo(10.0045f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.4955f, 13.25f)
                horizontalLineTo(6.5045f)
            }
        }
        .build()
        return _messages!!
    }

private var _messages: ImageVector? = null
