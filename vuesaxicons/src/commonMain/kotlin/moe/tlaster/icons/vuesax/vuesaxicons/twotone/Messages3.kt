package moe.tlaster.icons.vuesax.vuesaxicons.twotone

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
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Messages3: ImageVector
    get() {
        if (_messages3 != null) {
            return _messages3!!
        }
        _messages3 = Builder(name = "Messages3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.25f)
                verticalLineTo(11.35f)
                curveTo(22.0f, 12.62f, 21.58f, 13.69f, 20.83f, 14.43f)
                curveTo(20.09f, 15.18f, 19.02f, 15.6f, 17.75f, 15.6f)
                verticalLineTo(17.41f)
                curveTo(17.75f, 18.09f, 16.99f, 18.5f, 16.43f, 18.12f)
                lineTo(15.46f, 17.48f)
                curveTo(15.55f, 17.17f, 15.59f, 16.83f, 15.59f, 16.47f)
                verticalLineTo(12.4f)
                curveTo(15.59f, 10.36f, 14.23f, 9.0f, 12.19f, 9.0f)
                horizontalLineTo(5.4f)
                curveTo(5.26f, 9.0f, 5.13f, 9.01f, 5.0f, 9.02f)
                verticalLineTo(6.25f)
                curveTo(5.0f, 3.7f, 6.7f, 2.0f, 9.25f, 2.0f)
                horizontalLineTo(17.75f)
                curveTo(20.3f, 2.0f, 22.0f, 3.7f, 22.0f, 6.25f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.59f, 12.4f)
                verticalLineTo(16.47f)
                curveTo(15.59f, 16.83f, 15.55f, 17.17f, 15.46f, 17.48f)
                curveTo(15.09f, 18.95f, 13.87f, 19.87f, 12.19f, 19.87f)
                horizontalLineTo(9.47f)
                lineTo(6.45f, 21.88f)
                curveTo(6.0f, 22.19f, 5.4f, 21.86f, 5.4f, 21.32f)
                verticalLineTo(19.87f)
                curveTo(4.38f, 19.87f, 3.53f, 19.53f, 2.94f, 18.94f)
                curveTo(2.34f, 18.34f, 2.0f, 17.49f, 2.0f, 16.47f)
                verticalLineTo(12.4f)
                curveTo(2.0f, 10.5f, 3.18f, 9.19f, 5.0f, 9.02f)
                curveTo(5.13f, 9.01f, 5.26f, 9.0f, 5.4f, 9.0f)
                horizontalLineTo(12.19f)
                curveTo(14.23f, 9.0f, 15.59f, 10.36f, 15.59f, 12.4f)
                close()
            }
        }
        .build()
        return _messages3!!
    }

private var _messages3: ImageVector? = null
