package moe.tlaster.icons.vuesax.vuesaxicons.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Moneytick: ImageVector
    get() {
        if (_moneytick != null) {
            return _moneytick!!
        }
        _moneytick = Builder(name = "Moneytick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 18.5f, 20.0f, 20.0f, 17.0f, 20.0f)
                horizontalLineTo(8.45f)
                curveTo(8.8f, 19.41f, 9.0f, 18.73f, 9.0f, 18.0f)
                curveTo(9.0f, 15.79f, 7.21f, 14.0f, 5.0f, 14.0f)
                curveTo(3.8f, 14.0f, 2.73f, 14.53f, 2.0f, 15.36f)
                verticalLineTo(9.0f)
                curveTo(2.0f, 5.5f, 4.0f, 4.0f, 7.0f, 4.0f)
                horizontalLineTo(17.0f)
                curveTo(20.0f, 4.0f, 22.0f, 5.5f, 22.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.5f)
                curveTo(13.3807f, 14.5f, 14.5f, 13.3807f, 14.5f, 12.0f)
                curveTo(14.5f, 10.6193f, 13.3807f, 9.5f, 12.0f, 9.5f)
                curveTo(10.6193f, 9.5f, 9.5f, 10.6193f, 9.5f, 12.0f)
                curveTo(9.5f, 13.3807f, 10.6193f, 14.5f, 12.0f, 14.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 14.75f)
                curveTo(18.09f, 14.75f, 17.75f, 14.41f, 17.75f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(17.75f, 9.59f, 18.09f, 9.25f, 18.5f, 9.25f)
                curveTo(18.91f, 9.25f, 19.25f, 9.59f, 19.25f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(19.25f, 14.41f, 18.91f, 14.75f, 18.5f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 14.0f)
                curveTo(2.79f, 14.0f, 1.0f, 15.79f, 1.0f, 18.0f)
                curveTo(1.0f, 18.75f, 1.21f, 19.46f, 1.58f, 20.06f)
                curveTo(2.27f, 21.22f, 3.54f, 22.0f, 5.0f, 22.0f)
                curveTo(6.46f, 22.0f, 7.73f, 21.22f, 8.42f, 20.06f)
                curveTo(8.79f, 19.46f, 9.0f, 18.75f, 9.0f, 18.0f)
                curveTo(9.0f, 15.79f, 7.21f, 14.0f, 5.0f, 14.0f)
                close()
                moveTo(6.97f, 17.67f)
                lineTo(4.84f, 19.64f)
                curveTo(4.7f, 19.77f, 4.51f, 19.84f, 4.33f, 19.84f)
                curveTo(4.14f, 19.84f, 3.95f, 19.77f, 3.8f, 19.62f)
                lineTo(2.81f, 18.63f)
                curveTo(2.52f, 18.34f, 2.52f, 17.86f, 2.81f, 17.57f)
                curveTo(3.1f, 17.28f, 3.58f, 17.28f, 3.87f, 17.57f)
                lineTo(4.35f, 18.05f)
                lineTo(5.95f, 16.57f)
                curveTo(6.25f, 16.29f, 6.73f, 16.31f, 7.01f, 16.61f)
                curveTo(7.29f, 16.91f, 7.27f, 17.39f, 6.97f, 17.67f)
                close()
            }
        }
        .build()
        return _moneytick!!
    }

private var _moneytick: ImageVector? = null
