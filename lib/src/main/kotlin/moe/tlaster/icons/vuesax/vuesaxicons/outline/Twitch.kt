package moe.tlaster.icons.vuesax.vuesaxicons.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Twitch: ImageVector
    get() {
        if (_twitch != null) {
            return _twitch!!
        }
        _twitch = Builder(name = "Twitch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 22.75f)
                horizontalLineTo(6.5f)
                curveTo(6.09f, 22.75f, 5.75f, 22.41f, 5.75f, 22.0f)
                verticalLineTo(19.75f)
                horizontalLineTo(2.5f)
                curveTo(2.09f, 19.75f, 1.75f, 19.41f, 1.75f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(1.75f, 4.85f, 1.79f, 4.71f, 1.88f, 4.58f)
                lineTo(3.88f, 1.58f)
                curveTo(4.02f, 1.37f, 4.25f, 1.25f, 4.5f, 1.25f)
                horizontalLineTo(21.5f)
                curveTo(21.91f, 1.25f, 22.25f, 1.59f, 22.25f, 2.0f)
                verticalLineTo(14.0f)
                curveTo(22.25f, 14.2f, 22.17f, 14.39f, 22.03f, 14.53f)
                lineTo(17.03f, 19.53f)
                curveTo(16.89f, 19.67f, 16.7f, 19.75f, 16.5f, 19.75f)
                horizontalLineTo(11.9f)
                lineTo(10.12f, 22.42f)
                curveTo(9.98f, 22.62f, 9.75f, 22.75f, 9.5f, 22.75f)
                close()
                moveTo(7.25f, 21.25f)
                horizontalLineTo(9.1f)
                lineTo(10.88f, 18.58f)
                curveTo(11.02f, 18.37f, 11.25f, 18.25f, 11.5f, 18.25f)
                horizontalLineTo(16.19f)
                lineTo(20.75f, 13.69f)
                verticalLineTo(2.75f)
                horizontalLineTo(4.9f)
                lineTo(3.25f, 5.23f)
                verticalLineTo(18.25f)
                horizontalLineTo(6.5f)
                curveTo(6.91f, 18.25f, 7.25f, 18.59f, 7.25f, 19.0f)
                verticalLineTo(21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 13.75f)
                horizontalLineTo(9.0f)
                curveTo(8.59f, 13.75f, 8.25f, 13.41f, 8.25f, 13.0f)
                verticalLineTo(7.0f)
                curveTo(8.25f, 6.59f, 8.59f, 6.25f, 9.0f, 6.25f)
                horizontalLineTo(11.0f)
                curveTo(11.41f, 6.25f, 11.75f, 6.59f, 11.75f, 7.0f)
                verticalLineTo(13.0f)
                curveTo(11.75f, 13.41f, 11.41f, 13.75f, 11.0f, 13.75f)
                close()
                moveTo(9.75f, 12.25f)
                horizontalLineTo(10.25f)
                verticalLineTo(7.75f)
                horizontalLineTo(9.75f)
                verticalLineTo(12.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 13.75f)
                horizontalLineTo(14.0f)
                curveTo(13.59f, 13.75f, 13.25f, 13.41f, 13.25f, 13.0f)
                verticalLineTo(7.0f)
                curveTo(13.25f, 6.59f, 13.59f, 6.25f, 14.0f, 6.25f)
                horizontalLineTo(16.0f)
                curveTo(16.41f, 6.25f, 16.75f, 6.59f, 16.75f, 7.0f)
                verticalLineTo(13.0f)
                curveTo(16.75f, 13.41f, 16.41f, 13.75f, 16.0f, 13.75f)
                close()
                moveTo(14.75f, 12.25f)
                horizontalLineTo(15.25f)
                verticalLineTo(7.75f)
                horizontalLineTo(14.75f)
                verticalLineTo(12.25f)
                close()
            }
        }
        .build()
        return _twitch!!
    }

private var _twitch: ImageVector? = null
