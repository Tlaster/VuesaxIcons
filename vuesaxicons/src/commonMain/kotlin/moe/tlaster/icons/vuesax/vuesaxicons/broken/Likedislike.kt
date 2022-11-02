package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Likedislike: ImageVector
    get() {
        if (_likedislike != null) {
            return _likedislike!!
        }
        _likedislike = Builder(name = "Likedislike", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.9199f, 20.28f)
                lineTo(6.6899f, 21.65f)
                curveTo(6.9199f, 21.88f, 7.4299f, 21.99f, 7.7799f, 21.99f)
                horizontalLineTo(9.9499f)
                curveTo(10.6399f, 21.99f, 11.3799f, 21.48f, 11.5499f, 20.79f)
                lineTo(12.9199f, 16.62f)
                curveTo(13.2099f, 15.82f, 12.6899f, 15.13f, 11.8299f, 15.13f)
                horizontalLineTo(9.5399f)
                curveTo(9.1999f, 15.13f, 8.9099f, 14.8399f, 8.9699f, 14.4399f)
                lineTo(9.2599f, 12.61f)
                curveTo(9.3699f, 12.1f, 9.0299f, 11.52f, 8.5199f, 11.35f)
                curveTo(8.0599f, 11.18f, 7.4899f, 11.41f, 7.2599f, 11.75f)
                lineTo(4.9199f, 15.24f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 20.28f)
                curveTo(2.0f, 21.08f, 2.34f, 21.37f, 3.14f, 21.37f)
                horizontalLineTo(3.71f)
                curveTo(4.51f, 21.37f, 4.85f, 21.08f, 4.85f, 20.28f)
                verticalLineTo(14.6801f)
                curveTo(4.85f, 13.8801f, 4.51f, 13.59f, 3.71f, 13.59f)
                horizontalLineTo(3.14f)
                curveTo(2.34f, 13.59f, 2.0f, 13.8801f, 2.0f, 14.6801f)
                verticalLineTo(16.1801f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0808f, 3.72f)
                lineTo(17.3108f, 2.35f)
                curveTo(17.0808f, 2.12f, 16.5708f, 2.01f, 16.2208f, 2.01f)
                horizontalLineTo(14.0508f)
                curveTo(13.3608f, 2.01f, 12.6208f, 2.52f, 12.4508f, 3.21f)
                lineTo(11.0808f, 7.38f)
                curveTo(10.7908f, 8.18f, 11.3108f, 8.87f, 12.1708f, 8.87f)
                horizontalLineTo(14.4608f)
                curveTo(14.8008f, 8.87f, 15.0908f, 9.1601f, 15.0308f, 9.5601f)
                lineTo(14.7408f, 11.39f)
                curveTo(14.6308f, 11.9f, 14.9708f, 12.48f, 15.4808f, 12.65f)
                curveTo(15.9408f, 12.82f, 16.5108f, 12.59f, 16.7408f, 12.25f)
                lineTo(19.0808f, 8.76f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0004f, 3.72f)
                curveTo(22.0004f, 2.92f, 21.6604f, 2.63f, 20.8604f, 2.63f)
                horizontalLineTo(20.2904f)
                curveTo(19.4904f, 2.63f, 19.1504f, 2.92f, 19.1504f, 3.72f)
                verticalLineTo(9.32f)
                curveTo(19.1504f, 10.1199f, 19.4904f, 10.41f, 20.2904f, 10.41f)
                horizontalLineTo(20.8604f)
                curveTo(21.6604f, 10.41f, 22.0004f, 10.1199f, 22.0004f, 9.32f)
                verticalLineTo(8.0f)
            }
        }
        .build()
        return _likedislike!!
    }

private var _likedislike: ImageVector? = null
