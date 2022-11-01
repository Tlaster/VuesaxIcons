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

public val LinearGroup.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = Builder(name = "Gift", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.97f, 10.0f)
                horizontalLineTo(3.97f)
                verticalLineTo(18.0f)
                curveTo(3.97f, 21.0f, 4.97f, 22.0f, 7.97f, 22.0f)
                horizontalLineTo(15.97f)
                curveTo(18.97f, 22.0f, 19.97f, 21.0f, 19.97f, 18.0f)
                verticalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.5f, 7.0f)
                verticalLineTo(8.0f)
                curveTo(21.5f, 9.1f, 20.97f, 10.0f, 19.5f, 10.0f)
                horizontalLineTo(4.5f)
                curveTo(2.97f, 10.0f, 2.5f, 9.1f, 2.5f, 8.0f)
                verticalLineTo(7.0f)
                curveTo(2.5f, 5.9f, 2.97f, 5.0f, 4.5f, 5.0f)
                horizontalLineTo(19.5f)
                curveTo(20.97f, 5.0f, 21.5f, 5.9f, 21.5f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.64f, 4.9999f)
                horizontalLineTo(6.12f)
                curveTo(5.78f, 4.6299f, 5.79f, 4.0599f, 6.15f, 3.6999f)
                lineTo(7.57f, 2.2799f)
                curveTo(7.94f, 1.9099f, 8.55f, 1.9099f, 8.92f, 2.2799f)
                lineTo(11.64f, 4.9999f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.87f, 4.9999f)
                horizontalLineTo(12.35f)
                lineTo(15.07f, 2.2799f)
                curveTo(15.44f, 1.9099f, 16.05f, 1.9099f, 16.42f, 2.2799f)
                lineTo(17.84f, 3.6999f)
                curveTo(18.2f, 4.0599f, 18.21f, 4.6299f, 17.87f, 4.9999f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.9399f, 10.0f)
                verticalLineTo(15.14f)
                curveTo(8.9399f, 15.94f, 9.8199f, 16.41f, 10.4899f, 15.98f)
                lineTo(11.4299f, 15.36f)
                curveTo(11.7699f, 15.14f, 12.1999f, 15.14f, 12.5299f, 15.36f)
                lineTo(13.4199f, 15.96f)
                curveTo(14.0799f, 16.4f, 14.9699f, 15.93f, 14.9699f, 15.13f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.9399f)
                close()
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null
