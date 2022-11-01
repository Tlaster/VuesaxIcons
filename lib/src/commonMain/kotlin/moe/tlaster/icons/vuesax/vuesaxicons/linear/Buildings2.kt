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

public val LinearGroup.Buildings2: ImageVector
    get() {
        if (_buildings2 != null) {
            return _buildings2!!
        }
        _buildings2 = Builder(name = "Buildings2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.7f, 18.0f)
                horizontalLineTo(4.15f)
                curveTo(2.72f, 18.0f, 2.0f, 17.28f, 2.0f, 15.85f)
                verticalLineTo(4.15f)
                curveTo(2.0f, 2.72f, 2.72f, 2.0f, 4.15f, 2.0f)
                horizontalLineTo(8.45f)
                curveTo(9.88f, 2.0f, 10.6f, 2.72f, 10.6f, 4.15f)
                verticalLineTo(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.3699f, 8.42f)
                verticalLineTo(19.58f)
                curveTo(17.3699f, 21.19f, 16.57f, 22.0f, 14.96f, 22.0f)
                horizontalLineTo(9.1199f)
                curveTo(7.5099f, 22.0f, 6.7f, 21.19f, 6.7f, 19.58f)
                verticalLineTo(8.42f)
                curveTo(6.7f, 6.81f, 7.5099f, 6.0f, 9.1199f, 6.0f)
                horizontalLineTo(14.96f)
                curveTo(16.57f, 6.0f, 17.3699f, 6.81f, 17.3699f, 8.42f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.3999f, 6.0f)
                verticalLineTo(4.15f)
                curveTo(13.3999f, 2.72f, 14.1199f, 2.0f, 15.5499f, 2.0f)
                horizontalLineTo(19.8499f)
                curveTo(21.2799f, 2.0f, 21.9999f, 2.72f, 21.9999f, 4.15f)
                verticalLineTo(15.85f)
                curveTo(21.9999f, 17.28f, 21.2799f, 18.0f, 19.8499f, 18.0f)
                horizontalLineTo(17.3699f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 11.0f)
                horizontalLineTo(14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 14.0f)
                horizontalLineTo(14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                verticalLineTo(19.0f)
            }
        }
        .build()
        return _buildings2!!
    }

private var _buildings2: ImageVector? = null
