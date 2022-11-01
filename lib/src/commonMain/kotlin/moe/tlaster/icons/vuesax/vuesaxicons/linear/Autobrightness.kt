package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Bevel
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Autobrightness: ImageVector
    get() {
        if (_autobrightness != null) {
            return _autobrightness!!
        }
        _autobrightness = Builder(name = "Autobrightness", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.75f, 2.4499f)
                curveTo(11.45f, 1.8599f, 12.58f, 1.8599f, 13.26f, 2.4499f)
                lineTo(14.84f, 3.7999f)
                curveTo(15.14f, 4.05f, 15.71f, 4.26f, 16.11f, 4.26f)
                horizontalLineTo(17.81f)
                curveTo(18.87f, 4.26f, 19.74f, 5.13f, 19.74f, 6.1899f)
                verticalLineTo(7.8899f)
                curveTo(19.74f, 8.29f, 19.95f, 8.8499f, 20.2f, 9.15f)
                lineTo(21.55f, 10.7299f)
                curveTo(22.14f, 11.4299f, 22.14f, 12.5599f, 21.55f, 13.2399f)
                lineTo(20.2f, 14.8199f)
                curveTo(19.95f, 15.1199f, 19.74f, 15.6799f, 19.74f, 16.0799f)
                verticalLineTo(17.7799f)
                curveTo(19.74f, 18.8399f, 18.87f, 19.7099f, 17.81f, 19.7099f)
                horizontalLineTo(16.11f)
                curveTo(15.71f, 19.7099f, 15.15f, 19.9199f, 14.85f, 20.1699f)
                lineTo(13.27f, 21.5199f)
                curveTo(12.57f, 22.1099f, 11.44f, 22.1099f, 10.76f, 21.5199f)
                lineTo(9.18f, 20.1699f)
                curveTo(8.88f, 19.9199f, 8.31f, 19.7099f, 7.92f, 19.7099f)
                horizontalLineTo(6.17f)
                curveTo(5.11f, 19.7099f, 4.24f, 18.8399f, 4.24f, 17.7799f)
                verticalLineTo(16.0699f)
                curveTo(4.24f, 15.6799f, 4.04f, 15.1099f, 3.79f, 14.8199f)
                lineTo(2.44f, 13.2299f)
                curveTo(1.86f, 12.5399f, 1.86f, 11.4199f, 2.44f, 10.7299f)
                lineTo(3.79f, 9.1399f)
                curveTo(4.04f, 8.8399f, 4.24f, 8.28f, 4.24f, 7.8899f)
                verticalLineTo(6.2f)
                curveTo(4.24f, 5.1399f, 5.11f, 4.2699f, 6.17f, 4.2699f)
                horizontalLineTo(7.9f)
                curveTo(8.3f, 4.2699f, 8.86f, 4.0599f, 9.16f, 3.81f)
                lineTo(10.75f, 2.4499f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 15.9401f)
                lineTo(12.0f, 8.0601f)
                lineTo(15.5f, 15.9401f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.75f, 13.3101f)
                horizontalLineTo(10.25f)
            }
        }
        .build()
        return _autobrightness!!
    }

private var _autobrightness: ImageVector? = null
