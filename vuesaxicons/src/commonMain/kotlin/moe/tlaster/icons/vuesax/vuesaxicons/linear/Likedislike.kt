package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Likedislike: ImageVector
    get() {
        if (_likedislike != null) {
            return _likedislike!!
        }
        _likedislike = Builder(name = "Likedislike", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.92f, 20.28f)
                lineTo(6.69f, 21.65f)
                curveTo(6.92f, 21.88f, 7.43f, 21.99f, 7.78f, 21.99f)
                horizontalLineTo(9.95f)
                curveTo(10.64f, 21.99f, 11.38f, 21.48f, 11.55f, 20.79f)
                lineTo(12.92f, 16.62f)
                curveTo(13.21f, 15.82f, 12.69f, 15.13f, 11.83f, 15.13f)
                horizontalLineTo(9.54f)
                curveTo(9.2f, 15.13f, 8.91f, 14.8399f, 8.97f, 14.4399f)
                lineTo(9.26f, 12.61f)
                curveTo(9.37f, 12.1f, 9.03f, 11.52f, 8.52f, 11.35f)
                curveTo(8.06f, 11.18f, 7.49f, 11.41f, 7.26f, 11.75f)
                lineTo(4.92f, 15.24f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 20.28f)
                verticalLineTo(14.6801f)
                curveTo(2.0f, 13.8801f, 2.34f, 13.59f, 3.14f, 13.59f)
                horizontalLineTo(3.71f)
                curveTo(4.51f, 13.59f, 4.85f, 13.8801f, 4.85f, 14.6801f)
                verticalLineTo(20.28f)
                curveTo(4.85f, 21.08f, 4.51f, 21.37f, 3.71f, 21.37f)
                horizontalLineTo(3.14f)
                curveTo(2.34f, 21.37f, 2.0f, 21.09f, 2.0f, 20.28f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.08f, 3.72f)
                lineTo(17.31f, 2.35f)
                curveTo(17.08f, 2.12f, 16.57f, 2.01f, 16.22f, 2.01f)
                horizontalLineTo(14.05f)
                curveTo(13.36f, 2.01f, 12.62f, 2.52f, 12.45f, 3.21f)
                lineTo(11.08f, 7.38f)
                curveTo(10.79f, 8.18f, 11.31f, 8.87f, 12.17f, 8.87f)
                horizontalLineTo(14.46f)
                curveTo(14.8f, 8.87f, 15.09f, 9.1601f, 15.03f, 9.5601f)
                lineTo(14.74f, 11.39f)
                curveTo(14.63f, 11.9f, 14.97f, 12.48f, 15.48f, 12.65f)
                curveTo(15.94f, 12.82f, 16.51f, 12.59f, 16.74f, 12.25f)
                lineTo(19.08f, 8.76f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 3.72f)
                verticalLineTo(9.32f)
                curveTo(22.0f, 10.1199f, 21.66f, 10.41f, 20.86f, 10.41f)
                horizontalLineTo(20.29f)
                curveTo(19.49f, 10.41f, 19.15f, 10.1199f, 19.15f, 9.32f)
                verticalLineTo(3.72f)
                curveTo(19.15f, 2.92f, 19.49f, 2.63f, 20.29f, 2.63f)
                horizontalLineTo(20.86f)
                curveTo(21.66f, 2.63f, 22.0f, 2.91f, 22.0f, 3.72f)
                close()
            }
        }
        .build()
        return _likedislike!!
    }

private var _likedislike: ImageVector? = null
