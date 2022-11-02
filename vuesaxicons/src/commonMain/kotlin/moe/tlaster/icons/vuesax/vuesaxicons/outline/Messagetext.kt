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

public val OutlineGroup.Messagetext: ImageVector
    get() {
        if (_messagetext != null) {
            return _messagetext!!
        }
        _messagetext = Builder(name = "Messagetext", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.81f)
                curveTo(11.31f, 22.81f, 10.66f, 22.46f, 10.2f, 21.85f)
                lineTo(8.7f, 19.85f)
                curveTo(8.67f, 19.81f, 8.55f, 19.76f, 8.5f, 19.75f)
                horizontalLineTo(8.0f)
                curveTo(3.83f, 19.75f, 1.25f, 18.62f, 1.25f, 13.0f)
                verticalLineTo(8.0f)
                curveTo(1.25f, 3.58f, 3.58f, 1.25f, 8.0f, 1.25f)
                horizontalLineTo(16.0f)
                curveTo(20.42f, 1.25f, 22.75f, 3.58f, 22.75f, 8.0f)
                verticalLineTo(13.0f)
                curveTo(22.75f, 17.42f, 20.42f, 19.75f, 16.0f, 19.75f)
                horizontalLineTo(15.5f)
                curveTo(15.42f, 19.75f, 15.35f, 19.79f, 15.3f, 19.85f)
                lineTo(13.8f, 21.85f)
                curveTo(13.34f, 22.46f, 12.69f, 22.81f, 12.0f, 22.81f)
                close()
                moveTo(8.0f, 2.75f)
                curveTo(4.42f, 2.75f, 2.75f, 4.42f, 2.75f, 8.0f)
                verticalLineTo(13.0f)
                curveTo(2.75f, 17.52f, 4.3f, 18.25f, 8.0f, 18.25f)
                horizontalLineTo(8.5f)
                curveTo(9.01f, 18.25f, 9.59f, 18.54f, 9.9f, 18.95f)
                lineTo(11.4f, 20.95f)
                curveTo(11.75f, 21.41f, 12.25f, 21.41f, 12.6f, 20.95f)
                lineTo(14.1f, 18.95f)
                curveTo(14.43f, 18.51f, 14.95f, 18.25f, 15.5f, 18.25f)
                horizontalLineTo(16.0f)
                curveTo(19.58f, 18.25f, 21.25f, 16.58f, 21.25f, 13.0f)
                verticalLineTo(8.0f)
                curveTo(21.25f, 4.42f, 19.58f, 2.75f, 16.0f, 2.75f)
                horizontalLineTo(8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 8.75f)
                horizontalLineTo(7.0f)
                curveTo(6.59f, 8.75f, 6.25f, 8.41f, 6.25f, 8.0f)
                curveTo(6.25f, 7.59f, 6.59f, 7.25f, 7.0f, 7.25f)
                horizontalLineTo(17.0f)
                curveTo(17.41f, 7.25f, 17.75f, 7.59f, 17.75f, 8.0f)
                curveTo(17.75f, 8.41f, 17.41f, 8.75f, 17.0f, 8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 13.75f)
                horizontalLineTo(7.0f)
                curveTo(6.59f, 13.75f, 6.25f, 13.41f, 6.25f, 13.0f)
                curveTo(6.25f, 12.59f, 6.59f, 12.25f, 7.0f, 12.25f)
                horizontalLineTo(13.0f)
                curveTo(13.41f, 12.25f, 13.75f, 12.59f, 13.75f, 13.0f)
                curveTo(13.75f, 13.41f, 13.41f, 13.75f, 13.0f, 13.75f)
                close()
            }
        }
        .build()
        return _messagetext!!
    }

private var _messagetext: ImageVector? = null
