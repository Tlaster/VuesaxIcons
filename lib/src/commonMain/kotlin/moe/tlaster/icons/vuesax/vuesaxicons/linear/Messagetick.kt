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

public val LinearGroup.Messagetick: ImageVector
    get() {
        if (_messagetick != null) {
            return _messagetick!!
        }
        _messagetick = Builder(name = "Messagetick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 7.4299f)
                verticalLineTo(13.4299f)
                curveTo(22.0f, 14.9299f, 21.5f, 16.1799f, 20.62f, 17.0599f)
                curveTo(19.75f, 17.9299f, 18.5f, 18.4299f, 17.0f, 18.4299f)
                verticalLineTo(20.5599f)
                curveTo(17.0f, 21.3599f, 16.11f, 21.84f, 15.45f, 21.4f)
                lineTo(11.0f, 18.4299f)
                horizontalLineTo(8.88f)
                curveTo(8.96f, 18.1299f, 9.0f, 17.8199f, 9.0f, 17.4999f)
                curveTo(9.0f, 16.4799f, 8.61f, 15.54f, 7.97f, 14.83f)
                curveTo(7.25f, 14.01f, 6.18f, 13.4999f, 5.0f, 13.4999f)
                curveTo(3.88f, 13.4999f, 2.86f, 13.96f, 2.13f, 14.71f)
                curveTo(2.04f, 14.31f, 2.0f, 13.8799f, 2.0f, 13.4299f)
                verticalLineTo(7.4299f)
                curveTo(2.0f, 4.4299f, 4.0f, 2.4299f, 7.0f, 2.4299f)
                horizontalLineTo(17.0f)
                curveTo(20.0f, 2.4299f, 22.0f, 4.4299f, 22.0f, 7.4299f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 17.5f)
                curveTo(9.0f, 18.25f, 8.79f, 18.96f, 8.42f, 19.56f)
                curveTo(8.21f, 19.92f, 7.94f, 20.24f, 7.63f, 20.5f)
                curveTo(6.93f, 21.13f, 6.01f, 21.5f, 5.0f, 21.5f)
                curveTo(3.54f, 21.5f, 2.27f, 20.72f, 1.58f, 19.56f)
                curveTo(1.21f, 18.96f, 1.0f, 18.25f, 1.0f, 17.5f)
                curveTo(1.0f, 16.24f, 1.58f, 15.11f, 2.5f, 14.38f)
                curveTo(3.19f, 13.83f, 4.06f, 13.5f, 5.0f, 13.5f)
                curveTo(7.21f, 13.5f, 9.0f, 15.29f, 9.0f, 17.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.44f, 17.5f)
                lineTo(4.43f, 18.49f)
                lineTo(6.56f, 16.52f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 10.5f)
                horizontalLineTo(15.5f)
            }
        }
        .build()
        return _messagetick!!
    }

private var _messagetick: ImageVector? = null
